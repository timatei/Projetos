package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.VendedorDao;
import com.softwaresobmedida.model.Vendedor;

@Service("vendedorService")
@Transactional
public class VendedorServiceImpl implements VendedorService{

	@Autowired
	private VendedorDao dao;
	
	public List<Vendedor> findAll() {
		return dao.findAll();
	}
	
	public Vendedor findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Vendedor vendedor) {
		dao.save(vendedor);	
	}
	
	public void update(Vendedor vendedor) {
		dao.update(vendedor);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}