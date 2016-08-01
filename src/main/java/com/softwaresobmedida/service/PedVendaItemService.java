package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.PedVendaItem;

public interface PedVendaItemService {
	
	List<PedVendaItem> findAll();
	
	PedVendaItem findById(int id);
	
	void save(PedVendaItem pedVendaItem);
	
	void update(PedVendaItem pedVendaItem);
	
	void deleteById(int id);
	
}