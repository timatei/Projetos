package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.Produto;

public interface ProdutoService {
	
	List<Produto> findAll();
	
	Produto findById(int id);
	
	void save(Produto produto);
	
	void update(Produto produto);
	
	void deleteById(int id);
	
}