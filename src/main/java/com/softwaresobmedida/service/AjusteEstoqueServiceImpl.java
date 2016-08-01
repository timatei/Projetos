package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.AjusteEstoqueDao;
import com.softwaresobmedida.model.AjusteEstoque;

@Service("ajusteEstoqueService")
@Transactional
public class AjusteEstoqueServiceImpl implements AjusteEstoqueService{

	@Autowired
	private AjusteEstoqueDao dao;
	
	public List<AjusteEstoque> findAll() {
		return dao.findAll();
	}
	
	public AjusteEstoque findById(int id) {
		return dao.findById(id);
	}
	
	public void save(AjusteEstoque ajusteEstoque) {
		dao.save(ajusteEstoque);	
	}
	
	public void update(AjusteEstoque ajusteEstoque) {
		dao.update(ajusteEstoque);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}