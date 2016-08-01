package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.FormapagamentoDao;
import com.softwaresobmedida.model.Formapagamento;

@Service("formapagamentoService")
@Transactional
public class FormapagamentoServiceImpl implements FormapagamentoService{

	@Autowired
	private FormapagamentoDao dao;
	
	public List<Formapagamento> findAll() {
		return dao.findAll();
	}
	
	public Formapagamento findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Formapagamento formapagamento) {
		dao.save(formapagamento);	
	}
	
	public void update(Formapagamento formapagamento) {
		dao.update(formapagamento);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}