package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ProdutoGrupoSubGrp;

public interface ProdutoGrupoSubGrpDao {
	
	List<ProdutoGrupoSubGrp> findAll();
	
	ProdutoGrupoSubGrp findById(int id);
	
	void save(ProdutoGrupoSubGrp produtoGrupoSubGrp);
	
	void update(ProdutoGrupoSubGrp produtoGrupoSubGrp);
	
	void deleteById(int id);
	
}