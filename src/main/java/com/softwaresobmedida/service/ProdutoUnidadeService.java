package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ProdutoUnidade;

public interface ProdutoUnidadeService {
	
	List<ProdutoUnidade> findAll();
	
	ProdutoUnidade findById(int id);
	
	void save(ProdutoUnidade produtoUnidade);
	
	void update(ProdutoUnidade produtoUnidade);
	
	void deleteById(int id);
	
}