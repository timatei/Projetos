package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.CentCusto;

public interface CentCustoService {
	
	List<CentCusto> findAll();
	
	CentCusto findById(int id);
	
	void save(CentCusto centCusto);
	
	void update(CentCusto centCusto);
	
	void deleteById(int id);
	
}