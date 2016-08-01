package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.NfCompraDao;
import com.softwaresobmedida.model.NfCompra;

@Service("nfCompraService")
@Transactional
public class NfCompraServiceImpl implements NfCompraService{

	@Autowired
	private NfCompraDao dao;
	
	public List<NfCompra> findAll() {
		return dao.findAll();
	}
	
	public NfCompra findById(int id) {
		return dao.findById(id);
	}
	
	public void save(NfCompra nfCompra) {
		dao.save(nfCompra);	
	}
	
	public void update(NfCompra nfCompra) {
		dao.update(nfCompra);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}