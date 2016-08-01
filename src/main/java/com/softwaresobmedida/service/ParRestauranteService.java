package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ParRestaurante;

public interface ParRestauranteService {
	
	List<ParRestaurante> findAll();
	
	ParRestaurante findById(int id);
	
	void save(ParRestaurante parRestaurante);
	
	void update(ParRestaurante parRestaurante);
	
	void deleteById(int id);
	
}