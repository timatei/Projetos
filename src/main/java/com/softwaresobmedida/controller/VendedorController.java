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

import com.softwaresobmedida.model.Vendedor;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.VendedorService;

@Controller
@RequestMapping("/vendedor")
@SessionAttributes("roles")
public class VendedorController {
	@Autowired
	VendedorService vendedorService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<Vendedor> lista = vendedorService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "vendedor/vendedor-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		Vendedor vendedor = new Vendedor();
		model.addAttribute("vendedor", vendedor);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "vendedor/vendedor-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid Vendedor vendedor, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "vendedor/vendedor-registration";
		}

		vendedorService.save(vendedor);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/vendedor/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		Vendedor vendedor = vendedorService.findById(new Integer(id));
		model.addAttribute("vendedor", vendedor);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "vendedor/vendedor-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid Vendedor vendedor, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "vendedor/vendedor-registration";
		}

		vendedorService.update(vendedor);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/vendedor/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		vendedorService.deleteById(new Integer(id));
		return "redirect:/vendedor/list";
	}
}