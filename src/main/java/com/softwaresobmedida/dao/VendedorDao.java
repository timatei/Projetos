package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Vendedor;

public interface VendedorDao {
	
	List<Vendedor> findAll();
	
	Vendedor findById(int id);
	
	void save(Vendedor vendedor);
	
	void update(Vendedor vendedor);
	
	void deleteById(int id);
	
}