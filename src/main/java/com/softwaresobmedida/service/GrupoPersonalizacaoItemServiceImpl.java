package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.GrupoPersonalizacaoItemDao;
import com.softwaresobmedida.model.GrupoPersonalizacaoItem;

@Service("grupoPersonalizacaoItemService")
@Transactional
public class GrupoPersonalizacaoItemServiceImpl implements GrupoPersonalizacaoItemService{

	@Autowired
	private GrupoPersonalizacaoItemDao dao;
	
	public List<GrupoPersonalizacaoItem> findAll() {
		return dao.findAll();
	}
	
	public GrupoPersonalizacaoItem findById(int id) {
		return dao.findById(id);
	}
	
	public void save(GrupoPersonalizacaoItem grupoPersonalizacaoItem) {
		dao.save(grupoPersonalizacaoItem);	
	}
	
	public void update(GrupoPersonalizacaoItem grupoPersonalizacaoItem) {
		dao.update(grupoPersonalizacaoItem);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}