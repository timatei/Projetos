package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ContasDao;
import com.softwaresobmedida.model.Contas;

@Service("contasService")
@Transactional
public class ContasServiceImpl implements ContasService{

	@Autowired
	private ContasDao dao;
	
	public List<Contas> findAll() {
		return dao.findAll();
	}
	
	public Contas findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Contas contas) {
		dao.save(contas);	
	}
	
	public void update(Contas contas) {
		dao.update(contas);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}