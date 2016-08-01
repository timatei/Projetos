package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ParVenda;

public interface ParVendaService {
	
	List<ParVenda> findAll();
	
	ParVenda findById(int id);
	
	void save(ParVenda parVenda);
	
	void update(ParVenda parVenda);
	
	void deleteById(int id);
	
}