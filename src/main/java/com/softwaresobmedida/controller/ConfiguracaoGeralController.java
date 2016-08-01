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

import com.softwaresobmedida.model.ConfiguracaoGeral;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ConfiguracaoGeralService;

@Controller
@RequestMapping("/configuracaoGeral")
@SessionAttributes("roles")
public class ConfiguracaoGeralController {
	@Autowired
	ConfiguracaoGeralService configuracaoGeralService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ConfiguracaoGeral> lista = configuracaoGeralService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "configuracaoGeral/configuracaoGeral-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ConfiguracaoGeral configuracaoGeral = new ConfiguracaoGeral();
		model.addAttribute("configuracaoGeral", configuracaoGeral);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "configuracaoGeral/configuracaoGeral-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ConfiguracaoGeral configuracaoGeral, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "configuracaoGeral/configuracaoGeral-registration";
		}

		configuracaoGeralService.save(configuracaoGeral);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/configuracaoGeral/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ConfiguracaoGeral configuracaoGeral = configuracaoGeralService.findById(new Integer(id));
		model.addAttribute("configuracaoGeral", configuracaoGeral);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "configuracaoGeral/configuracaoGeral-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ConfiguracaoGeral configuracaoGeral, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "configuracaoGeral/configuracaoGeral-registration";
		}

		configuracaoGeralService.update(configuracaoGeral);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/configuracaoGeral/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		configuracaoGeralService.deleteById(new Integer(id));
		return "redirect:/configuracaoGeral/list";
	}
}