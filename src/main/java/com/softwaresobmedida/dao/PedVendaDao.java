package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.PedVenda;

public interface PedVendaDao {
	
	List<PedVenda> findAll();
	
	PedVenda findById(int id);
	
	void save(PedVenda pedVenda);
	
	void update(PedVenda pedVenda);
	
	void deleteById(int id);
	
}