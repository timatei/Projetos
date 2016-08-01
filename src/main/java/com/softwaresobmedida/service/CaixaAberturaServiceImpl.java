package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.CaixaAberturaDao;
import com.softwaresobmedida.model.CaixaAbertura;

@Service("caixaAberturaService")
@Transactional
public class CaixaAberturaServiceImpl implements CaixaAberturaService{

	@Autowired
	private CaixaAberturaDao dao;
	
	public List<CaixaAbertura> findAll() {
		return dao.findAll();
	}
	
	public CaixaAbertura findById(int id) {
		return dao.findById(id);
	}
	
	public void save(CaixaAbertura caixaAbertura) {
		dao.save(caixaAbertura);	
	}
	
	public void update(CaixaAbertura caixaAbertura) {
		dao.update(caixaAbertura);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}