package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ParVendaDao;
import com.softwaresobmedida.model.ParVenda;

@Service("parVendaService")
@Transactional
public class ParVendaServiceImpl implements ParVendaService{

	@Autowired
	private ParVendaDao dao;
	
	public List<ParVenda> findAll() {
		return dao.findAll();
	}
	
	public ParVenda findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ParVenda parVenda) {
		dao.save(parVenda);	
	}
	
	public void update(ParVenda parVenda) {
		dao.update(parVenda);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}