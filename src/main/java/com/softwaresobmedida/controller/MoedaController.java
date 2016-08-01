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

import com.softwaresobmedida.model.Moeda;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.MoedaService;

@Controller
@RequestMapping("/moeda")
@SessionAttributes("roles")
public class MoedaController {
	@Autowired
	MoedaService moedaService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<Moeda> lista = moedaService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "moeda/moeda-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		Moeda moeda = new Moeda();
		model.addAttribute("moeda", moeda);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "moeda/moeda-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid Moeda moeda, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "moeda/moeda-registration";
		}

		moedaService.save(moeda);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/moeda/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		Moeda moeda = moedaService.findById(new Integer(id));
		model.addAttribute("moeda", moeda);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "moeda/moeda-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid Moeda moeda, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "moeda/moeda-registration";
		}

		moedaService.update(moeda);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/moeda/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		moedaService.deleteById(new Integer(id));
		return "redirect:/moeda/list";
	}
}