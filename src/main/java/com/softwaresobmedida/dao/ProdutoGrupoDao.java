package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ProdutoGrupo;

public interface ProdutoGrupoDao {
	
	List<ProdutoGrupo> findAll();
	
	ProdutoGrupo findById(int id);
	
	void save(ProdutoGrupo produtoGrupo);
	
	void update(ProdutoGrupo produtoGrupo);
	
	void deleteById(int id);
	
}