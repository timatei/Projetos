package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.AjusteEstoque;

public interface AjusteEstoqueDao {
	
	List<AjusteEstoque> findAll();
	
	AjusteEstoque findById(int id);
	
	void save(AjusteEstoque ajusteEstoque);
	
	void update(AjusteEstoque ajusteEstoque);
	
	void deleteById(int id);
	
}