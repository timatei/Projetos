package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.BancoDao;
import com.softwaresobmedida.model.Banco;

@Service("bancoService")
@Transactional
public class BancoServiceImpl implements BancoService{

	@Autowired
	private BancoDao dao;
	
	public List<Banco> findAll() {
		return dao.findAll();
	}
	
	public Banco findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Banco banco) {
		dao.save(banco);	
	}
	
	public void update(Banco banco) {
		dao.update(banco);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}