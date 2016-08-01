package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.AjusteEstoqueItem;

public interface AjusteEstoqueItemService {
	
	List<AjusteEstoqueItem> findAll();
	
	AjusteEstoqueItem findById(int id);
	
	void save(AjusteEstoqueItem ajusteEstoqueItem);
	
	void update(AjusteEstoqueItem ajusteEstoqueItem);
	
	void deleteById(int id);
	
}