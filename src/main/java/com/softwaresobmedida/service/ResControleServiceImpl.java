package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ResControleDao;
import com.softwaresobmedida.model.ResControle;

@Service("resControleService")
@Transactional
public class ResControleServiceImpl implements ResControleService{

	@Autowired
	private ResControleDao dao;
	
	public List<ResControle> findAll() {
		return dao.findAll();
	}
	
	public ResControle findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ResControle resControle) {
		dao.save(resControle);	
	}
	
	public void update(ResControle resControle) {
		dao.update(resControle);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}