package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.AjusteEstoque;

public interface AjusteEstoqueService {
	
	List<AjusteEstoque> findAll();
	
	AjusteEstoque findById(int id);
	
	void save(AjusteEstoque ajusteEstoque);
	
	void update(AjusteEstoque ajusteEstoque);
	
	void deleteById(int id);
	
}