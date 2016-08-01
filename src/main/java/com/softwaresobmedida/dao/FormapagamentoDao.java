package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.Formapagamento;

public interface FormapagamentoDao {
	
	List<Formapagamento> findAll();
	
	Formapagamento findById(int id);
	
	void save(Formapagamento formapagamento);
	
	void update(Formapagamento formapagamento);
	
	void deleteById(int id);
	
}