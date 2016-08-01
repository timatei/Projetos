package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.Vendedor;

public interface VendedorService {
	
	List<Vendedor> findAll();
	
	Vendedor findById(int id);
	
	void save(Vendedor vendedor);
	
	void update(Vendedor vendedor);
	
	void deleteById(int id);
	
}