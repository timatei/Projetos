package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.NfCompra;

public interface NfCompraDao {
	
	List<NfCompra> findAll();
	
	NfCompra findById(int id);
	
	void save(NfCompra nfCompra);
	
	void update(NfCompra nfCompra);
	
	void deleteById(int id);
	
}