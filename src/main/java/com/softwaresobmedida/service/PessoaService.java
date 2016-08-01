package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.Pessoa;

public interface PessoaService {
	
	List<Pessoa> findAll();
	
	Pessoa findById(int id);
	
	void save(Pessoa pessoa);
	
	void update(Pessoa pessoa);
	
	void deleteById(int id);
	
}