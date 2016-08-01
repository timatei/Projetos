package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.GrupoPersonalizacaoItem;

public interface GrupoPersonalizacaoItemDao {
	
	List<GrupoPersonalizacaoItem> findAll();
	
	GrupoPersonalizacaoItem findById(int id);
	
	void save(GrupoPersonalizacaoItem grupoPersonalizacaoItem);
	
	void update(GrupoPersonalizacaoItem grupoPersonalizacaoItem);
	
	void deleteById(int id);
	
}