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

import com.softwaresobmedida.model.ResPedidoItemPerso;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ResPedidoItemPersoService;

@Controller
@RequestMapping("/resPedidoItemPerso")
@SessionAttributes("roles")
public class ResPedidoItemPersoController {
	@Autowired
	ResPedidoItemPersoService resPedidoItemPersoService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ResPedidoItemPerso> lista = resPedidoItemPersoService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "resPedidoItemPerso/resPedidoItemPerso-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ResPedidoItemPerso resPedidoItemPerso = new ResPedidoItemPerso();
		model.addAttribute("resPedidoItemPerso", resPedidoItemPerso);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "resPedidoItemPerso/resPedidoItemPerso-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ResPedidoItemPerso resPedidoItemPerso, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "resPedidoItemPerso/resPedidoItemPerso-registration";
		}

		resPedidoItemPersoService.save(resPedidoItemPerso);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/resPedidoItemPerso/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ResPedidoItemPerso resPedidoItemPerso = resPedidoItemPersoService.findById(new Integer(id));
		model.addAttribute("resPedidoItemPerso", resPedidoItemPerso);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "resPedidoItemPerso/resPedidoItemPerso-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ResPedidoItemPerso resPedidoItemPerso, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "resPedidoItemPerso/resPedidoItemPerso-registration";
		}

		resPedidoItemPersoService.update(resPedidoItemPerso);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/resPedidoItemPerso/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		resPedidoItemPersoService.deleteById(new Integer(id));
		return "redirect:/resPedidoItemPerso/list";
	}
}