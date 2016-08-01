package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ProdutoDao;
import com.softwaresobmedida.model.Produto;

@Service("produtoService")
@Transactional
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	private ProdutoDao dao;
	
	public List<Produto> findAll() {
		return dao.findAll();
	}
	
	public Produto findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Produto produto) {
		dao.save(produto);	
	}
	
	public void update(Produto produto) {
		dao.update(produto);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}