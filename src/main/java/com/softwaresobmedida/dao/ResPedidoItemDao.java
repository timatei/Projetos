package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ResPedidoItem;

public interface ResPedidoItemDao {
	
	List<ResPedidoItem> findAll();
	
	ResPedidoItem findById(int id);
	
	void save(ResPedidoItem resPedidoItem);
	
	void update(ResPedidoItem resPedidoItem);
	
	void deleteById(int id);
	
}