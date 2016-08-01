package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ProdutoGrupoSubGrpDao;
import com.softwaresobmedida.model.ProdutoGrupoSubGrp;

@Service("produtoGrupoSubGrpService")
@Transactional
public class ProdutoGrupoSubGrpServiceImpl implements ProdutoGrupoSubGrpService{

	@Autowired
	private ProdutoGrupoSubGrpDao dao;
	
	public List<ProdutoGrupoSubGrp> findAll() {
		return dao.findAll();
	}
	
	public ProdutoGrupoSubGrp findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ProdutoGrupoSubGrp produtoGrupoSubGrp) {
		dao.save(produtoGrupoSubGrp);	
	}
	
	public void update(ProdutoGrupoSubGrp produtoGrupoSubGrp) {
		dao.update(produtoGrupoSubGrp);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}