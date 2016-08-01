package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ContasBaixas;

public interface ContasBaixasDao {
	
	List<ContasBaixas> findAll();
	
	ContasBaixas findById(int id);
	
	void save(ContasBaixas contasBaixas);
	
	void update(ContasBaixas contasBaixas);
	
	void deleteById(int id);
	
}