package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.PedVendaItem;

public interface PedVendaItemDao {
	
	List<PedVendaItem> findAll();
	
	PedVendaItem findById(int id);
	
	void save(PedVendaItem pedVendaItem);
	
	void update(PedVendaItem pedVendaItem);
	
	void deleteById(int id);
	
}