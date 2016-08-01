package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.PedVenda;

@Repository("pedVendaDao")
public class PedVendaDaoImpl extends AbstractDao<Integer, PedVenda> implements PedVendaDao {

	static final Logger logger = LoggerFactory.getLogger(PedVendaDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<PedVenda> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<PedVenda> lista = (List<PedVenda>) criteria.list();

		return lista;
	}
	
	public PedVenda findById(int id) {
		PedVenda pedVenda = getByKey(id);
		return pedVenda;
	}
	
	public void save(PedVenda pedVenda) {
		persist(pedVenda);
	}
	
	public void update(PedVenda pedVenda) {
		persistUpdate(pedVenda);
	}

	public void deleteById(int id) {
		PedVenda pedVenda = getByKey(id);
		delete(pedVenda);
	}
}