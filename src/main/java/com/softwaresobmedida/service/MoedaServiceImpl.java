package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.MoedaDao;
import com.softwaresobmedida.model.Moeda;

@Service("moedaService")
@Transactional
public class MoedaServiceImpl implements MoedaService{

	@Autowired
	private MoedaDao dao;
	
	public List<Moeda> findAll() {
		return dao.findAll();
	}
	
	public Moeda findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Moeda moeda) {
		dao.save(moeda);	
	}
	
	public void update(Moeda moeda) {
		dao.update(moeda);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}