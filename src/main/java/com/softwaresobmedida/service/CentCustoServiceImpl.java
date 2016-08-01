package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.CentCustoDao;
import com.softwaresobmedida.model.CentCusto;

@Service("centCustoService")
@Transactional
public class CentCustoServiceImpl implements CentCustoService{

	@Autowired
	private CentCustoDao dao;
	
	public List<CentCusto> findAll() {
		return dao.findAll();
	}
	
	public CentCusto findById(int id) {
		return dao.findById(id);
	}
	
	public void save(CentCusto centCusto) {
		dao.save(centCusto);	
	}
	
	public void update(CentCusto centCusto) {
		dao.update(centCusto);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}