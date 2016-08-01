package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Pessoa;

public interface PessoaDao {
	
	List<Pessoa> findAll();
	
	Pessoa findById(int id);
	
	void save(Pessoa pessoa);
	
	void update(Pessoa pessoa);
	
	void deleteById(int id);
	
}