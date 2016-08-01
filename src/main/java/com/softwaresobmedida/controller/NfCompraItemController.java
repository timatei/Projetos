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

import com.softwaresobmedida.model.NfCompraItem;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.NfCompraItemService;

@Controller
@RequestMapping("/nfCompraItem")
@SessionAttributes("roles")
public class NfCompraItemController {
	@Autowired
	NfCompraItemService nfCompraItemService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<NfCompraItem> lista = nfCompraItemService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "nfCompraItem/nfCompraItem-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		NfCompraItem nfCompraItem = new NfCompraItem();
		model.addAttribute("nfCompraItem", nfCompraItem);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "nfCompraItem/nfCompraItem-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid NfCompraItem nfCompraItem, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "nfCompraItem/nfCompraItem-registration";
		}

		nfCompraItemService.save(nfCompraItem);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/nfCompraItem/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		NfCompraItem nfCompraItem = nfCompraItemService.findById(new Integer(id));
		model.addAttribute("nfCompraItem", nfCompraItem);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "nfCompraItem/nfCompraItem-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid NfCompraItem nfCompraItem, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "nfCompraItem/nfCompraItem-registration";
		}

		nfCompraItemService.update(nfCompraItem);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/nfCompraItem/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		nfCompraItemService.deleteById(new Integer(id));
		return "redirect:/nfCompraItem/list";
	}
}