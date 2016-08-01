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

import com.softwaresobmedida.model.AjusteEstoqueItem;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.AjusteEstoqueItemService;

@Controller
@RequestMapping("/ajusteEstoqueItem")
@SessionAttributes("roles")
public class AjusteEstoqueItemController {
	@Autowired
	AjusteEstoqueItemService ajusteEstoqueItemService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<AjusteEstoqueItem> lista = ajusteEstoqueItemService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "ajusteEstoqueItem/ajusteEstoqueItem-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		AjusteEstoqueItem ajusteEstoqueItem = new AjusteEstoqueItem();
		model.addAttribute("ajusteEstoqueItem", ajusteEstoqueItem);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "ajusteEstoqueItem/ajusteEstoqueItem-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid AjusteEstoqueItem ajusteEstoqueItem, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "ajusteEstoqueItem/ajusteEstoqueItem-registration";
		}

		ajusteEstoqueItemService.save(ajusteEstoqueItem);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/ajusteEstoqueItem/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		AjusteEstoqueItem ajusteEstoqueItem = ajusteEstoqueItemService.findById(new Integer(id));
		model.addAttribute("ajusteEstoqueItem", ajusteEstoqueItem);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "ajusteEstoqueItem/ajusteEstoqueItem-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid AjusteEstoqueItem ajusteEstoqueItem, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "ajusteEstoqueItem/ajusteEstoqueItem-registration";
		}

		ajusteEstoqueItemService.update(ajusteEstoqueItem);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/ajusteEstoqueItem/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		ajusteEstoqueItemService.deleteById(new Integer(id));
		return "redirect:/ajusteEstoqueItem/list";
	}
}