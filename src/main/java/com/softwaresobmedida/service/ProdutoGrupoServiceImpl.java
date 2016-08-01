package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ProdutoGrupoDao;
import com.softwaresobmedida.model.ProdutoGrupo;

@Service("produtoGrupoService")
@Transactional
public class ProdutoGrupoServiceImpl implements ProdutoGrupoService{

	@Autowired
	private ProdutoGrupoDao dao;
	
	public List<ProdutoGrupo> findAll() {
		return dao.findAll();
	}
	
	public ProdutoGrupo findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ProdutoGrupo produtoGrupo) {
		dao.save(produtoGrupo);	
	}
	
	public void update(ProdutoGrupo produtoGrupo) {
		dao.update(produtoGrupo);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}