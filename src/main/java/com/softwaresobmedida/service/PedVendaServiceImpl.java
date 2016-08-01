package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.PedVendaDao;
import com.softwaresobmedida.model.PedVenda;

@Service("pedVendaService")
@Transactional
public class PedVendaServiceImpl implements PedVendaService{

	@Autowired
	private PedVendaDao dao;
	
	public List<PedVenda> findAll() {
		return dao.findAll();
	}
	
	public PedVenda findById(int id) {
		return dao.findById(id);
	}
	
	public void save(PedVenda pedVenda) {
		dao.save(pedVenda);	
	}
	
	public void update(PedVenda pedVenda) {
		dao.update(pedVenda);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}