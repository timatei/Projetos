package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ResPedidoDao;
import com.softwaresobmedida.model.ResPedido;

@Service("resPedidoService")
@Transactional
public class ResPedidoServiceImpl implements ResPedidoService{

	@Autowired
	private ResPedidoDao dao;
	
	public List<ResPedido> findAll() {
		return dao.findAll();
	}
	
	public ResPedido findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ResPedido resPedido) {
		dao.save(resPedido);	
	}
	
	public void update(ResPedido resPedido) {
		dao.update(resPedido);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}