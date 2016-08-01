package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ContasBaixasDao;
import com.softwaresobmedida.model.ContasBaixas;

@Service("contasBaixasService")
@Transactional
public class ContasBaixasServiceImpl implements ContasBaixasService{

	@Autowired
	private ContasBaixasDao dao;
	
	public List<ContasBaixas> findAll() {
		return dao.findAll();
	}
	
	public ContasBaixas findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ContasBaixas contasBaixas) {
		dao.save(contasBaixas);	
	}
	
	public void update(ContasBaixas contasBaixas) {
		dao.update(contasBaixas);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}