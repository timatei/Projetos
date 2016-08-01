package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ResControle;

public interface ResControleService {
	
	List<ResControle> findAll();
	
	ResControle findById(int id);
	
	void save(ResControle resControle);
	
	void update(ResControle resControle);
	
	void deleteById(int id);
	
}