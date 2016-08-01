package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ImpressaoDao;
import com.softwaresobmedida.model.Impressao;

@Service("impressaoService")
@Transactional
public class ImpressaoServiceImpl implements ImpressaoService{

	@Autowired
	private ImpressaoDao dao;
	
	public List<Impressao> findAll() {
		return dao.findAll();
	}
	
	public Impressao findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Impressao impressao) {
		dao.save(impressao);	
	}
	
	public void update(Impressao impressao) {
		dao.update(impressao);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}