package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Banco;

public interface BancoDao {
	
	List<Banco> findAll();
	
	Banco findById(int id);
	
	void save(Banco banco);
	
	void update(Banco banco);
	
	void deleteById(int id);
	
}