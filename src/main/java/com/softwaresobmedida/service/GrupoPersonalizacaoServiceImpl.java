package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.GrupoPersonalizacaoDao;
import com.softwaresobmedida.model.GrupoPersonalizacao;

@Service("grupoPersonalizacaoService")
@Transactional
public class GrupoPersonalizacaoServiceImpl implements GrupoPersonalizacaoService{

	@Autowired
	private GrupoPersonalizacaoDao dao;
	
	public List<GrupoPersonalizacao> findAll() {
		return dao.findAll();
	}
	
	public GrupoPersonalizacao findById(int id) {
		return dao.findById(id);
	}
	
	public void save(GrupoPersonalizacao grupoPersonalizacao) {
		dao.save(grupoPersonalizacao);	
	}
	
	public void update(GrupoPersonalizacao grupoPersonalizacao) {
		dao.update(grupoPersonalizacao);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}