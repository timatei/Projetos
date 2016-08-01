package com.softwaresobmedida.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.softwaresobmedida.dao.NfCompraItemDao;
import com.softwaresobmedida.model.NfCompraItem;

@Service("nfCompraItemService")
@Transactional
public class NfCompraItemServiceImpl implements NfCompraItemService{

	@Autowired
	private NfCompraItemDao dao;
	
	public List<NfCompraItem> findAll() {
		return dao.findAll();
	}
	
	public NfCompraItem findById(int id) {
		return dao.findById(id);
	}
	
	public void save(NfCompraItem nfCompraItem) {
		dao.save(nfCompraItem);	
	}
	
	public void update(NfCompraItem nfCompraItem) {
		dao.update(nfCompraItem);	
	}
	
	public void deleteById(int id) {
		dao.deleteById(id);
	}
	
}