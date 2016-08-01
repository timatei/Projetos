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

import com.softwaresobmedida.model.GrupoPersonalizacao;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.GrupoPersonalizacaoService;

@Controller
@RequestMapping("/grupoPersonalizacao")
@SessionAttributes("roles")
public class GrupoPersonalizacaoController {
	@Autowired
	GrupoPersonalizacaoService grupoPersonalizacaoService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<GrupoPersonalizacao> lista = grupoPersonalizacaoService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "grupoPersonalizacao/grupoPersonalizacao-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		GrupoPersonalizacao grupoPersonalizacao = new GrupoPersonalizacao();
		model.addAttribute("grupoPersonalizacao", grupoPersonalizacao);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "grupoPersonalizacao/grupoPersonalizacao-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid GrupoPersonalizacao grupoPersonalizacao, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "grupoPersonalizacao/grupoPersonalizacao-registration";
		}

		grupoPersonalizacaoService.save(grupoPersonalizacao);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/grupoPersonalizacao/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		GrupoPersonalizacao grupoPersonalizacao = grupoPersonalizacaoService.findById(new Integer(id));
		model.addAttribute("grupoPersonalizacao", grupoPersonalizacao);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "grupoPersonalizacao/grupoPersonalizacao-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid GrupoPersonalizacao grupoPersonalizacao, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "grupoPersonalizacao/grupoPersonalizacao-registration";
		}

		grupoPersonalizacaoService.update(grupoPersonalizacao);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/grupoPersonalizacao/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		grupoPersonalizacaoService.deleteById(new Integer(id));
		return "redirect:/grupoPersonalizacao/list";
	}
}