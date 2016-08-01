package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ProdutoUnidadeDao;
import com.softwaresobmedida.model.ProdutoUnidade;

@Service("produtoUnidadeService")
@Transactional
public class ProdutoUnidadeServiceImpl implements ProdutoUnidadeService{

	@Autowired
	private ProdutoUnidadeDao dao;
	
	public List<ProdutoUnidade> findAll() {
		return dao.findAll();
	}
	
	public ProdutoUnidade findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ProdutoUnidade produtoUnidade) {
		dao.save(produtoUnidade);	
	}
	
	public void update(ProdutoUnidade produtoUnidade) {
		dao.update(produtoUnidade);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}