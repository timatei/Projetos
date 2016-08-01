package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ProdutoGrupo;

public interface ProdutoGrupoService {
	
	List<ProdutoGrupo> findAll();
	
	ProdutoGrupo findById(int id);
	
	void save(ProdutoGrupo produtoGrupo);
	
	void update(ProdutoGrupo produtoGrupo);
	
	void deleteById(int id);
	
}