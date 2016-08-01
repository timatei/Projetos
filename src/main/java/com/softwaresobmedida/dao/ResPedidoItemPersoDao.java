package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ResPedidoItemPerso;

public interface ResPedidoItemPersoDao {
	
	List<ResPedidoItemPerso> findAll();
	
	ResPedidoItemPerso findById(int id);
	
	void save(ResPedidoItemPerso resPedidoItemPerso);
	
	void update(ResPedidoItemPerso resPedidoItemPerso);
	
	void deleteById(int id);
	
}