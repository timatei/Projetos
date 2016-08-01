package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ProdutoPersonalizacaoDao;
import com.softwaresobmedida.model.ProdutoPersonalizacao;

@Service("produtoPersonalizacaoService")
@Transactional
public class ProdutoPersonalizacaoServiceImpl implements ProdutoPersonalizacaoService{

	@Autowired
	private ProdutoPersonalizacaoDao dao;
	
	public List<ProdutoPersonalizacao> findAll() {
		return dao.findAll();
	}
	
	public ProdutoPersonalizacao findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ProdutoPersonalizacao produtoPersonalizacao) {
		dao.save(produtoPersonalizacao);	
	}
	
	public void update(ProdutoPersonalizacao produtoPersonalizacao) {
		dao.update(produtoPersonalizacao);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}