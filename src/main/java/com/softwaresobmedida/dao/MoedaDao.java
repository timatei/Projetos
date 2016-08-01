package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Moeda;

public interface MoedaDao {
	
	List<Moeda> findAll();
	
	Moeda findById(int id);
	
	void save(Moeda moeda);
	
	void update(Moeda moeda);
	
	void deleteById(int id);
	
}