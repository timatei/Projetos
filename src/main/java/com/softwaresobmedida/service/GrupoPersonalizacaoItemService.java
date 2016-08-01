package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.GrupoPersonalizacaoItem;

public interface GrupoPersonalizacaoItemService {
	
	List<GrupoPersonalizacaoItem> findAll();
	
	GrupoPersonalizacaoItem findById(int id);
	
	void save(GrupoPersonalizacaoItem grupoPersonalizacaoItem);
	
	void update(GrupoPersonalizacaoItem grupoPersonalizacaoItem);
	
	void deleteById(int id);
	
}