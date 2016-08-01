package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ContasBaixas;

public interface ContasBaixasService {
	
	List<ContasBaixas> findAll();
	
	ContasBaixas findById(int id);
	
	void save(ContasBaixas contasBaixas);
	
	void update(ContasBaixas contasBaixas);
	
	void deleteById(int id);
	
}