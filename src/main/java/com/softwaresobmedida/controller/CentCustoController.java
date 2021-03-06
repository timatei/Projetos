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

import com.softwaresobmedida.model.CentCusto;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.CentCustoService;

@Controller
@RequestMapping("/centCusto")
@SessionAttributes("roles")
public class CentCustoController {
	@Autowired
	CentCustoService centCustoService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<CentCusto> lista = centCustoService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "centCusto/centCusto-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		CentCusto centCusto = new CentCusto();
		model.addAttribute("centCusto", centCusto);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "centCusto/centCusto-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid CentCusto centCusto, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "centCusto/centCusto-registration";
		}

		centCustoService.save(centCusto);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/centCusto/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		CentCusto centCusto = centCustoService.findById(new Integer(id));
		model.addAttribute("centCusto", centCusto);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "centCusto/centCusto-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid CentCusto centCusto, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "centCusto/centCusto-registration";
		}

		centCustoService.update(centCusto);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/centCusto/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		centCustoService.deleteById(new Integer(id));
		return "redirect:/centCusto/list";
	}
}