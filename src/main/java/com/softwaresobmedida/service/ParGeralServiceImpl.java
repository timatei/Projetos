package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ParGeralDao;
import com.softwaresobmedida.model.ParGeral;

@Service("parGeralService")
@Transactional
public class ParGeralServiceImpl implements ParGeralService{

	@Autowired
	private ParGeralDao dao;
	
	public List<ParGeral> findAll() {
		return dao.findAll();
	}
	
	public ParGeral findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ParGeral parGeral) {
		dao.save(parGeral);	
	}
	
	public void update(ParGeral parGeral) {
		dao.update(parGeral);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}