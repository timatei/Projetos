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

import com.softwaresobmedida.model.PedVendaItem;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.PedVendaItemService;

@Controller
@RequestMapping("/pedVendaItem")
@SessionAttributes("roles")
public class PedVendaItemController {
	@Autowired
	PedVendaItemService pedVendaItemService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<PedVendaItem> lista = pedVendaItemService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "pedVendaItem/pedVendaItem-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		PedVendaItem pedVendaItem = new PedVendaItem();
		model.addAttribute("pedVendaItem", pedVendaItem);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "pedVendaItem/pedVendaItem-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid PedVendaItem pedVendaItem, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "pedVendaItem/pedVendaItem-registration";
		}

		pedVendaItemService.save(pedVendaItem);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/pedVendaItem/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		PedVendaItem pedVendaItem = pedVendaItemService.findById(new Integer(id));
		model.addAttribute("pedVendaItem", pedVendaItem);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "pedVendaItem/pedVendaItem-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid PedVendaItem pedVendaItem, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "pedVendaItem/pedVendaItem-registration";
		}

		pedVendaItemService.update(pedVendaItem);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/pedVendaItem/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		pedVendaItemService.deleteById(new Integer(id));
		return "redirect:/pedVendaItem/list";
	}
}