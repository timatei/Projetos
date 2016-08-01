package com.softwaresobmedida.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.softwaresobmedida.model.ParRestaurante;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ParRestauranteService;

@Controller
@RequestMapping("/parRestaurante")
@SessionAttributes("roles")
public class ParRestauranteController {
	@Autowired
	ParRestauranteService parRestauranteService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ParRestaurante> lista = parRestauranteService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "parRestaurante/parRestaurante-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ParRestaurante parRestaurante = new ParRestaurante();
		model.addAttribute("parRestaurante", parRestaurante);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "parRestaurante/parRestaurante-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ParRestaurante parRestaurante, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "parRestaurante/parRestaurante-registration";
		}

		parRestauranteService.save(parRestaurante);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/parRestaurante/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ParRestaurante parRestaurante = parRestauranteService.findById(new Integer(id));
		model.addAttribute("parRestaurante", parRestaurante);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "parRestaurante/parRestaurante-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ParRestaurante parRestaurante, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "parRestaurante/parRestaurante-registration";
		}

		parRestauranteService.update(parRestaurante);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/parRestaurante/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		parRestauranteService.deleteById(new Integer(id));
		return "redirect:/parRestaurante/list";
	}
}