package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ResPedido;

public interface ResPedidoDao {
	
	List<ResPedido> findAll();
	
	ResPedido findById(int id);
	
	void save(ResPedido resPedido);
	
	void update(ResPedido resPedido);
	
	void deleteById(int id);
	
}