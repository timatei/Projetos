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

import com.softwaresobmedida.model.ResPedidoItem;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ResPedidoItemService;

@Controller
@RequestMapping("/resPedidoItem")
@SessionAttributes("roles")
public class ResPedidoItemController {
	@Autowired
	ResPedidoItemService resPedidoItemService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ResPedidoItem> lista = resPedidoItemService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "resPedidoItem/resPedidoItem-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ResPedidoItem resPedidoItem = new ResPedidoItem();
		model.addAttribute("resPedidoItem", resPedidoItem);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "resPedidoItem/resPedidoItem-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ResPedidoItem resPedidoItem, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "resPedidoItem/resPedidoItem-registration";
		}

		resPedidoItemService.save(resPedidoItem);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/resPedidoItem/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ResPedidoItem resPedidoItem = resPedidoItemService.findById(new Integer(id));
		model.addAttribute("resPedidoItem", resPedidoItem);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "resPedidoItem/resPedidoItem-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ResPedidoItem resPedidoItem, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "resPedidoItem/resPedidoItem-registration";
		}

		resPedidoItemService.update(resPedidoItem);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/resPedidoItem/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		resPedidoItemService.deleteById(new Integer(id));
		return "redirect:/resPedidoItem/list";
	}
}