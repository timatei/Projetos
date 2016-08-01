package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.PedVendaItemDao;
import com.softwaresobmedida.model.PedVendaItem;

@Service("pedVendaItemService")
@Transactional
public class PedVendaItemServiceImpl implements PedVendaItemService{

	@Autowired
	private PedVendaItemDao dao;
	
	public List<PedVendaItem> findAll() {
		return dao.findAll();
	}
	
	public PedVendaItem findById(int id) {
		return dao.findById(id);
	}
	
	public void save(PedVendaItem pedVendaItem) {
		dao.save(pedVendaItem);	
	}
	
	public void update(PedVendaItem pedVendaItem) {
		dao.update(pedVendaItem);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}