package com.softwaresobmedida.service;

import java.util.List;

import com.softwaresobmedida.model.ParGeral;

public interface ParGeralService {
	
	List<ParGeral> findAll();
	
	ParGeral findById(int id);
	
	void save(ParGeral parGeral);
	
	void update(ParGeral parGeral);
	
	void deleteById(int id);
	
}