package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.PessoaDao;
import com.softwaresobmedida.model.Pessoa;

@Service("pessoaService")
@Transactional
public class PessoaServiceImpl implements PessoaService{

	@Autowired
	private PessoaDao dao;
	
	public List<Pessoa> findAll() {
		return dao.findAll();
	}
	
	public Pessoa findById(int id) {
		return dao.findById(id);
	}
	
	public void save(Pessoa pessoa) {
		dao.save(pessoa);	
	}
	
	public void update(Pessoa pessoa) {
		dao.update(pessoa);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}