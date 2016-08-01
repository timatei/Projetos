package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.PedVendaItem;

@Repository("pedVendaItemDao")
public class PedVendaItemDaoImpl extends AbstractDao<Integer, PedVendaItem> implements PedVendaItemDao {

	static final Logger logger = LoggerFactory.getLogger(PedVendaItemDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<PedVendaItem> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<PedVendaItem> lista = (List<PedVendaItem>) criteria.list();

		return lista;
	}
	
	public PedVendaItem findById(int id) {
		PedVendaItem pedVendaItem = getByKey(id);
		return pedVendaItem;
	}
	
	public void save(PedVendaItem pedVendaItem) {
		persist(pedVendaItem);
	}
	
	public void update(PedVendaItem pedVendaItem) {
		persistUpdate(pedVendaItem);
	}

	public void deleteById(int id) {
		PedVendaItem pedVendaItem = getByKey(id);
		delete(pedVendaItem);
	}
}