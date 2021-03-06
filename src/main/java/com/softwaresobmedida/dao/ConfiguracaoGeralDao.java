package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ConfiguracaoGeral;

public interface ConfiguracaoGeralDao {
	
	List<ConfiguracaoGeral> findAll();
	
	ConfiguracaoGeral findById(int id);
	
	void save(ConfiguracaoGeral configuracaoGeral);
	
	void update(ConfiguracaoGeral configuracaoGeral);
	
	void deleteById(int id);
	
}