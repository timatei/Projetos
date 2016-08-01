package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ResPedidoItem;

public interface ResPedidoItemService {
	
	List<ResPedidoItem> findAll();
	
	ResPedidoItem findById(int id);
	
	void save(ResPedidoItem resPedidoItem);
	
	void update(ResPedidoItem resPedidoItem);
	
	void deleteById(int id);
	
}