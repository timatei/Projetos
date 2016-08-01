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

import com.softwaresobmedida.model.AjusteEstoque;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.AjusteEstoqueService;

@Controller
@RequestMapping("/ajusteEstoque")
@SessionAttributes("roles")
public class AjusteEstoqueController {
	@Autowired
	AjusteEstoqueService ajusteEstoqueService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<AjusteEstoque> lista = ajusteEstoqueService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "ajusteEstoque/ajusteEstoque-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		AjusteEstoque ajusteEstoque = new AjusteEstoque();
		model.addAttribute("ajusteEstoque", ajusteEstoque);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "ajusteEstoque/ajusteEstoque-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid AjusteEstoque ajusteEstoque, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "ajusteEstoque/ajusteEstoque-registration";
		}

		ajusteEstoqueService.save(ajusteEstoque);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/ajusteEstoque/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		AjusteEstoque ajusteEstoque = ajusteEstoqueService.findById(new Integer(id));
		model.addAttribute("ajusteEstoque", ajusteEstoque);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "ajusteEstoque/ajusteEstoque-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid AjusteEstoque ajusteEstoque, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "ajusteEstoque/ajusteEstoque-registration";
		}

		ajusteEstoqueService.update(ajusteEstoque);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/ajusteEstoque/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		ajusteEstoqueService.deleteById(new Integer(id));
		return "redirect:/ajusteEstoque/list";
	}
}