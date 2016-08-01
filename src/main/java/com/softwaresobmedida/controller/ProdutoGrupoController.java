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

import com.softwaresobmedida.model.ProdutoGrupo;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ProdutoGrupoService;

@Controller
@RequestMapping("/produtoGrupo")
@SessionAttributes("roles")
public class ProdutoGrupoController {
	@Autowired
	ProdutoGrupoService produtoGrupoService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ProdutoGrupo> lista = produtoGrupoService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoGrupo/produtoGrupo-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ProdutoGrupo produtoGrupo = new ProdutoGrupo();
		model.addAttribute("produtoGrupo", produtoGrupo);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoGrupo/produtoGrupo-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ProdutoGrupo produtoGrupo, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "produtoGrupo/produtoGrupo-registration";
		}

		produtoGrupoService.save(produtoGrupo);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/produtoGrupo/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ProdutoGrupo produtoGrupo = produtoGrupoService.findById(new Integer(id));
		model.addAttribute("produtoGrupo", produtoGrupo);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoGrupo/produtoGrupo-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ProdutoGrupo produtoGrupo, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "produtoGrupo/produtoGrupo-registration";
		}

		produtoGrupoService.update(produtoGrupo);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/produtoGrupo/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		produtoGrupoService.deleteById(new Integer(id));
		return "redirect:/produtoGrupo/list";
	}
}