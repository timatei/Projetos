package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ConfiguracaoGeralDao;
import com.softwaresobmedida.model.ConfiguracaoGeral;

@Service("configuracaoGeralService")
@Transactional
public class ConfiguracaoGeralServiceImpl implements ConfiguracaoGeralService{

	@Autowired
	private ConfiguracaoGeralDao dao;
	
	public List<ConfiguracaoGeral> findAll() {
		return dao.findAll();
	}
	
	public ConfiguracaoGeral findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ConfiguracaoGeral configuracaoGeral) {
		dao.save(configuracaoGeral);	
	}
	
	public void update(ConfiguracaoGeral configuracaoGeral) {
		dao.update(configuracaoGeral);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}