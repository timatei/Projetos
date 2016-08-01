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

import com.softwaresobmedida.model.Impressao;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ImpressaoService;

@Controller
@RequestMapping("/impressao")
@SessionAttributes("roles")
public class ImpressaoController {
	@Autowired
	ImpressaoService impressaoService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<Impressao> lista = impressaoService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "impressao/impressao-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		Impressao impressao = new Impressao();
		model.addAttribute("impressao", impressao);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "impressao/impressao-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid Impressao impressao, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "impressao/impressao-registration";
		}

		impressaoService.save(impressao);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/impressao/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		Impressao impressao = impressaoService.findById(new Integer(id));
		model.addAttribute("impressao", impressao);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "impressao/impressao-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid Impressao impressao, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "impressao/impressao-registration";
		}

		impressaoService.update(impressao);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/impressao/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		impressaoService.deleteById(new Integer(id));
		return "redirect:/impressao/list";
	}
}