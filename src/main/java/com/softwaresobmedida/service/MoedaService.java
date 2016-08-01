package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.Moeda;

public interface MoedaService {
	
	List<Moeda> findAll();
	
	Moeda findById(int id);
	
	void save(Moeda moeda);
	
	void update(Moeda moeda);
	
	void deleteById(int id);
	
}