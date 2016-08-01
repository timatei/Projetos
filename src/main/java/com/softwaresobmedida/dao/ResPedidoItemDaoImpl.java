package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ResPedidoItem;

@Repository("resPedidoItemDao")
public class ResPedidoItemDaoImpl extends AbstractDao<Integer, ResPedidoItem> implements ResPedidoItemDao {

	static final Logger logger = LoggerFactory.getLogger(ResPedidoItemDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ResPedidoItem> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ResPedidoItem> lista = (List<ResPedidoItem>) criteria.list();

		return lista;
	}
	
	public ResPedidoItem findById(int id) {
		ResPedidoItem resPedidoItem = getByKey(id);
		return resPedidoItem;
	}
	
	public void save(ResPedidoItem resPedidoItem) {
		persist(resPedidoItem);
	}
	
	public void update(ResPedidoItem resPedidoItem) {
		persistUpdate(resPedidoItem);
	}

	public void deleteById(int id) {
		ResPedidoItem resPedidoItem = getByKey(id);
		delete(resPedidoItem);
	}
}