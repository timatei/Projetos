package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Produto;

public interface ProdutoDao {
	
	List<Produto> findAll();
	
	Produto findById(int id);
	
	void save(Produto produto);
	
	void update(Produto produto);
	
	void deleteById(int id);
	
}