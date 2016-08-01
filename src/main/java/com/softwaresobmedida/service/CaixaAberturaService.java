package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.CaixaAbertura;

public interface CaixaAberturaService {
	
	List<CaixaAbertura> findAll();
	
	CaixaAbertura findById(int id);
	
	void save(CaixaAbertura caixaAbertura);
	
	void update(CaixaAbertura caixaAbertura);
	
	void deleteById(int id);
	
}