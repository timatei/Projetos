package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ParRestauranteDao;
import com.softwaresobmedida.model.ParRestaurante;

@Service("parRestauranteService")
@Transactional
public class ParRestauranteServiceImpl implements ParRestauranteService{

	@Autowired
	private ParRestauranteDao dao;
	
	public List<ParRestaurante> findAll() {
		return dao.findAll();
	}
	
	public ParRestaurante findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ParRestaurante parRestaurante) {
		dao.save(parRestaurante);	
	}
	
	public void update(ParRestaurante parRestaurante) {
		dao.update(parRestaurante);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}