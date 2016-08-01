package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.AjusteEstoqueItemDao;
import com.softwaresobmedida.model.AjusteEstoqueItem;

@Service("ajusteEstoqueItemService")
@Transactional
public class AjusteEstoqueItemServiceImpl implements AjusteEstoqueItemService{

	@Autowired
	private AjusteEstoqueItemDao dao;
	
	public List<AjusteEstoqueItem> findAll() {
		return dao.findAll();
	}
	
	public AjusteEstoqueItem findById(int id) {
		return dao.findById(id);
	}
	
	public void save(AjusteEstoqueItem ajusteEstoqueItem) {
		dao.save(ajusteEstoqueItem);	
	}
	
	public void update(AjusteEstoqueItem ajusteEstoqueItem) {
		dao.update(ajusteEstoqueItem);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}