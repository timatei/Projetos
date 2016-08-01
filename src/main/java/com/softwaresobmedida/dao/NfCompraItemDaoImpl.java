package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.NfCompraItem;

@Repository("nfCompraItemDao")
public class NfCompraItemDaoImpl extends AbstractDao<Integer, NfCompraItem> implements NfCompraItemDao {

	static final Logger logger = LoggerFactory.getLogger(NfCompraItemDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<NfCompraItem> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<NfCompraItem> lista = (List<NfCompraItem>) criteria.list();

		return lista;
	}
	
	public NfCompraItem findById(int id) {
		NfCompraItem nfCompraItem = getByKey(id);
		return nfCompraItem;
	}
	
	public void save(NfCompraItem nfCompraItem) {
		persist(nfCompraItem);
	}
	
	public void update(NfCompraItem nfCompraItem) {
		persistUpdate(nfCompraItem);
	}

	public void deleteById(int id) {
		NfCompraItem nfCompraItem = getByKey(id);
		delete(nfCompraItem);
	}
}