package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.ResPedidoItemDao;
import com.softwaresobmedida.model.ResPedidoItem;

@Service("resPedidoItemService")
@Transactional
public class ResPedidoItemServiceImpl implements ResPedidoItemService{

	@Autowired
	private ResPedidoItemDao dao;
	
	public List<ResPedidoItem> findAll() {
		return dao.findAll();
	}
	
	public ResPedidoItem findById(int id) {
		return dao.findById(id);
	}
	
	public void save(ResPedidoItem resPedidoItem) {
		dao.save(resPedidoItem);	
	}
	
	public void update(ResPedidoItem resPedidoItem) {
		dao.update(resPedidoItem);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}