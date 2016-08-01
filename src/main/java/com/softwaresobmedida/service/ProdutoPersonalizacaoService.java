package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ProdutoPersonalizacao;

public interface ProdutoPersonalizacaoService {
	
	List<ProdutoPersonalizacao> findAll();
	
	ProdutoPersonalizacao findById(int id);
	
	void save(ProdutoPersonalizacao produtoPersonalizacao);
	
	void update(ProdutoPersonalizacao produtoPersonalizacao);
	
	void deleteById(int id);
	
}