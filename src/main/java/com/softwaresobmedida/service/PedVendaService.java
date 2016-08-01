package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.PedVenda;

public interface PedVendaService {
	
	List<PedVenda> findAll();
	
	PedVenda findById(int id);
	
	void save(PedVenda pedVenda);
	
	void update(PedVenda pedVenda);
	
	void deleteById(int id);
	
}