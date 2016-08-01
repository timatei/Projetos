package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.Contas;

public interface ContasService {
	
	List<Contas> findAll();
	
	Contas findById(int id);
	
	void save(Contas contas);
	
	void update(Contas contas);
	
	void deleteById(int id);
	
}