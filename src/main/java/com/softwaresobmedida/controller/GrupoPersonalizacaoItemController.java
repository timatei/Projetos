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

import com.softwaresobmedida.model.GrupoPersonalizacaoItem;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.GrupoPersonalizacaoItemService;

@Controller
@RequestMapping("/grupoPersonalizacaoItem")
@SessionAttributes("roles")
public class GrupoPersonalizacaoItemController {
	@Autowired
	GrupoPersonalizacaoItemService grupoPersonalizacaoItemService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<GrupoPersonalizacaoItem> lista = grupoPersonalizacaoItemService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "grupoPersonalizacaoItem/grupoPersonalizacaoItem-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		GrupoPersonalizacaoItem grupoPersonalizacaoItem = new GrupoPersonalizacaoItem();
		model.addAttribute("grupoPersonalizacaoItem", grupoPersonalizacaoItem);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "grupoPersonalizacaoItem/grupoPersonalizacaoItem-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid GrupoPersonalizacaoItem grupoPersonalizacaoItem, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "grupoPersonalizacaoItem/grupoPersonalizacaoItem-registration";
		}

		grupoPersonalizacaoItemService.save(grupoPersonalizacaoItem);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/grupoPersonalizacaoItem/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		GrupoPersonalizacaoItem grupoPersonalizacaoItem = grupoPersonalizacaoItemService.findById(new Integer(id));
		model.addAttribute("grupoPersonalizacaoItem", grupoPersonalizacaoItem);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "grupoPersonalizacaoItem/grupoPersonalizacaoItem-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid GrupoPersonalizacaoItem grupoPersonalizacaoItem, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "grupoPersonalizacaoItem/grupoPersonalizacaoItem-registration";
		}

		grupoPersonalizacaoItemService.update(grupoPersonalizacaoItem);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/grupoPersonalizacaoItem/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		grupoPersonalizacaoItemService.deleteById(new Integer(id));
		return "redirect:/grupoPersonalizacaoItem/list";
	}
}