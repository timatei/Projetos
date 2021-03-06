package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.GrupoPersonalizacao;

public interface GrupoPersonalizacaoDao {
	
	List<GrupoPersonalizacao> findAll();
	
	GrupoPersonalizacao findById(int id);
	
	void save(GrupoPersonalizacao grupoPersonalizacao);
	
	void update(GrupoPersonalizacao grupoPersonalizacao);
	
	void deleteById(int id);
	
}