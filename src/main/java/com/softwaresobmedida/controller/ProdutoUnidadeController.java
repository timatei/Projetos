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

import com.softwaresobmedida.model.ProdutoUnidade;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ProdutoUnidadeService;

@Controller
@RequestMapping("/produtoUnidade")
@SessionAttributes("roles")
public class ProdutoUnidadeController {
	@Autowired
	ProdutoUnidadeService produtoUnidadeService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ProdutoUnidade> lista = produtoUnidadeService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoUnidade/produtoUnidade-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ProdutoUnidade produtoUnidade = new ProdutoUnidade();
		model.addAttribute("produtoUnidade", produtoUnidade);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoUnidade/produtoUnidade-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ProdutoUnidade produtoUnidade, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "produtoUnidade/produtoUnidade-registration";
		}

		produtoUnidadeService.save(produtoUnidade);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/produtoUnidade/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ProdutoUnidade produtoUnidade = produtoUnidadeService.findById(new Integer(id));
		model.addAttribute("produtoUnidade", produtoUnidade);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoUnidade/produtoUnidade-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ProdutoUnidade produtoUnidade, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "produtoUnidade/produtoUnidade-registration";
		}

		produtoUnidadeService.update(produtoUnidade);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/produtoUnidade/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		produtoUnidadeService.deleteById(new Integer(id));
		return "redirect:/produtoUnidade/list";
	}
}