package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ResPedido;

public interface ResPedidoService {
	
	List<ResPedido> findAll();
	
	ResPedido findById(int id);
	
	void save(ResPedido resPedido);
	
	void update(ResPedido resPedido);
	
	void deleteById(int id);
	
}