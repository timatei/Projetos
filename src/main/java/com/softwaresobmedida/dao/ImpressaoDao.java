package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Impressao;

public interface ImpressaoDao {
	
	List<Impressao> findAll();
	
	Impressao findById(int id);
	
	void save(Impressao impressao);
	
	void update(Impressao impressao);
	
	void deleteById(int id);
	
}