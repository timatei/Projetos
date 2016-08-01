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

import com.softwaresobmedida.model.ContasBaixas;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ContasBaixasService;

@Controller
@RequestMapping("/contasBaixas")
@SessionAttributes("roles")
public class ContasBaixasController {
	@Autowired
	ContasBaixasService contasBaixasService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ContasBaixas> lista = contasBaixasService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "contasBaixas/contasBaixas-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ContasBaixas contasBaixas = new ContasBaixas();
		model.addAttribute("contasBaixas", contasBaixas);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "contasBaixas/contasBaixas-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ContasBaixas contasBaixas, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "contasBaixas/contasBaixas-registration";
		}

		contasBaixasService.save(contasBaixas);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/contasBaixas/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ContasBaixas contasBaixas = contasBaixasService.findById(new Integer(id));
		model.addAttribute("contasBaixas", contasBaixas);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "contasBaixas/contasBaixas-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ContasBaixas contasBaixas, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "contasBaixas/contasBaixas-registration";
		}

		contasBaixasService.update(contasBaixas);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/contasBaixas/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		contasBaixasService.deleteById(new Integer(id));
		return "redirect:/contasBaixas/list";
	}
}