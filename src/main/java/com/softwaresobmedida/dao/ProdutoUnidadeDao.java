package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ProdutoUnidade;

public interface ProdutoUnidadeDao {
	
	List<ProdutoUnidade> findAll();
	
	ProdutoUnidade findById(int id);
	
	void save(ProdutoUnidade produtoUnidade);
	
	void update(ProdutoUnidade produtoUnidade);
	
	void deleteById(int id);
	
}