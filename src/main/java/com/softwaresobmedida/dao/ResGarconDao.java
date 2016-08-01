package com.softwaresobmedida.dao;

import java.util.List;

import com.softwaresobmedida.model.ResGarcon;

public interface ResGarconDao {
	
	List<ResGarcon> findAll();
	
	ResGarcon findById(int id);
	
	void save(ResGarcon resGarcon);
	
	void update(ResGarcon resGarcon);
	
	void deleteById(int id);
	
}