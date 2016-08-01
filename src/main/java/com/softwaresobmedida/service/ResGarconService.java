package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ResGarcon;

public interface ResGarconService {
	
	List<ResGarcon> findAll();
	
	ResGarcon findById(int id);
	
	void save(ResGarcon resGarcon);
	
	void update(ResGarcon resGarcon);
	
	void deleteById(int id);
	
}