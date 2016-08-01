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

import com.softwaresobmedida.model.ProdutoGrupoSubGrp;
import com.softwaresobmedida.security.UtilSecurity;
import com.softwaresobmedida.service.ProdutoGrupoSubGrpService;

@Controller
@RequestMapping("/produtoGrupoSubGrp")
@SessionAttributes("roles")
public class ProdutoGrupoSubGrpController {
	@Autowired
	ProdutoGrupoSubGrpService produtoGrupoSubGrpService;
	
	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String lista(
			final ModelMap model) 
	{
		List<ProdutoGrupoSubGrp> lista = produtoGrupoSubGrpService.findAll();
		model.addAttribute("lista", lista);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoGrupoSubGrp/produtoGrupoSubGrp-list";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String novo(
			final ModelMap model) 
	{
		ProdutoGrupoSubGrp produtoGrupoSubGrp = new ProdutoGrupoSubGrp();
		model.addAttribute("produtoGrupoSubGrp", produtoGrupoSubGrp);
		model.addAttribute("edit", false);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoGrupoSubGrp/produtoGrupoSubGrp-registration";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String save(
			@Valid ProdutoGrupoSubGrp produtoGrupoSubGrp, 
			final BindingResult result,
			final ModelMap model,
			final RedirectAttributes redirectAttributes) 
	{

		if (result.hasErrors()) {
			return "produtoGrupoSubGrp/produtoGrupoSubGrp-registration";
		}

		produtoGrupoSubGrpService.save(produtoGrupoSubGrp);

		redirectAttributes.addFlashAttribute("success", "Cadastrado com sucesso!");
		return "redirect:/produtoGrupoSubGrp/list";
	}

	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String edit(
			@PathVariable String id, 
			final ModelMap model) 
	{
		ProdutoGrupoSubGrp produtoGrupoSubGrp = produtoGrupoSubGrpService.findById(new Integer(id));
		model.addAttribute("produtoGrupoSubGrp", produtoGrupoSubGrp);
		model.addAttribute("edit", true);
		model.addAttribute("loggedinuser", UtilSecurity.getPrincipal());
		return "produtoGrupoSubGrp/produtoGrupoSubGrp-registration";
	}
	
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public String update(
			@Valid ProdutoGrupoSubGrp produtoGrupoSubGrp, 
			@PathVariable String id,
			final BindingResult result,
			final ModelMap model, 
			final RedirectAttributes redirectAttributes) 
	{
		if (result.hasErrors()) {
			return "produtoGrupoSubGrp/produtoGrupoSubGrp-registration";
		}

		produtoGrupoSubGrpService.update(produtoGrupoSubGrp);

		redirectAttributes.addFlashAttribute("success", "Atualizado com sucesso!");
		return "redirect:/produtoGrupoSubGrp/list";
	}
	
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public String delete(
			@PathVariable String id,
			final RedirectAttributes redirectAttributes) 
	{
		redirectAttributes.addFlashAttribute("warning", "Deletado com sucesso!");
		produtoGrupoSubGrpService.deleteById(new Integer(id));
		return "redirect:/produtoGrupoSubGrp/list";
	}
}