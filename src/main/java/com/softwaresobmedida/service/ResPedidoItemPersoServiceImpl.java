package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ResPedidoItemPersoDao;
import com.softwaresobmedida.model.ResPedidoItemPerso;

@Service("resPedidoItemPersoService")
@Transactional
public class ResPedidoItemPersoServiceImpl implements ResPedidoItemPersoService{

	@Autowired
	private ResPedidoItemPersoDao dao;
	
	public List<ResPedidoItemPerso> findAll() {
		return dao.findAll();
	}
	
	public ResPedidoItemPerso findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ResPedidoItemPerso resPedidoItemPerso) {
		dao.save(resPedidoItemPerso);	
	}
	
	public void update(ResPedidoItemPerso resPedidoItemPerso) {
		dao.update(resPedidoItemPerso);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}