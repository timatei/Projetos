package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.CaixaAbertura;

public interface CaixaAberturaDao {
	
	List<CaixaAbertura> findAll();
	
	CaixaAbertura findById(int id);
	
	void save(CaixaAbertura caixaAbertura);
	
	void update(CaixaAbertura caixaAbertura);
	
	void deleteById(int id);
	
}