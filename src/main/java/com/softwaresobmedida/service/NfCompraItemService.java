package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.NfCompraItem;

public interface NfCompraItemService {
	
	List<NfCompraItem> findAll();
	
	NfCompraItem findById(int id);
	
	void save(NfCompraItem nfCompraItem);
	
	void update(NfCompraItem nfCompraItem);
	
	void deleteById(int id);
	
}