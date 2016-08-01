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

import com.softwaresobmedida.model.ProdutoPersonalizacao;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ProdutoPersonalizacaoService;

@Controller
@RequestMapping("/produtoPersonalizacao")
@SessionAttributes("roles")
public class ProdutoPersonalizacaoController {
	@Autowired
	ProdutoPersonalizacaoService produtoPersonalizacaoService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ProdutoPersonalizacao> lista = produtoPersonalizacaoService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoPersonalizacao/produtoPersonalizacao-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ProdutoPersonalizacao produtoPersonalizacao = new ProdutoPersonalizacao();
		model.addAttribute("produtoPersonalizacao", produtoPersonalizacao);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoPersonalizacao/produtoPersonalizacao-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ProdutoPersonalizacao produtoPersonalizacao, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "produtoPersonalizacao/produtoPersonalizacao-registration";
		}

		produtoPersonalizacaoService.save(produtoPersonalizacao);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/produtoPersonalizacao/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ProdutoPersonalizacao produtoPersonalizacao = produtoPersonalizacaoService.findById(new Integer(id));
		model.addAttribute("produtoPersonalizacao", produtoPersonalizacao);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoPersonalizacao/produtoPersonalizacao-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ProdutoPersonalizacao produtoPersonalizacao, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "produtoPersonalizacao/produtoPersonalizacao-registration";
		}

		produtoPersonalizacaoService.update(produtoPersonalizacao);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/produtoPersonalizacao/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		produtoPersonalizacaoService.deleteById(new Integer(id));
		return "redirect:/produtoPersonalizacao/list";
	}
}