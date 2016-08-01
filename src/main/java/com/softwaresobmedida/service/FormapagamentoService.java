package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.Formapagamento;

public interface FormapagamentoService {
	
	List<Formapagamento> findAll();
	
	Formapagamento findById(int id);
	
	void save(Formapagamento formapagamento);
	
	void update(Formapagamento formapagamento);
	
	void deleteById(int id);
	
}