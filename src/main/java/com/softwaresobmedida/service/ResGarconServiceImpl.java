package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ResGarconDao;
import com.softwaresobmedida.model.ResGarcon;

@Service("resGarconService")
@Transactional
public class ResGarconServiceImpl implements ResGarconService{

	@Autowired
	private ResGarconDao dao;
	
	public List<ResGarcon> findAll() {
		return dao.findAll();
	}
	
	public ResGarcon findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ResGarcon resGarcon) {
		dao.save(resGarcon);	
	}
	
	public void update(ResGarcon resGarcon) {
		dao.update(resGarcon);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}