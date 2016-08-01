package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ResPedido;

@Repository("resPedidoDao")
public class ResPedidoDaoImpl extends AbstractDao<Integer, ResPedido> implements ResPedidoDao {

	static final Logger logger = LoggerFactory.getLogger(ResPedidoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ResPedido> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ResPedido> lista = (List<ResPedido>) criteria.list();

		return lista;
	}
	
	public ResPedido findById(int id) {
		ResPedido resPedido = getByKey(id);
		return resPedido;
	}
	
	public void save(ResPedido resPedido) {
		persist(resPedido);
	}
	
	public void update(ResPedido resPedido) {
		persistUpdate(resPedido);
	}

	public void deleteById(int id) {
		ResPedido resPedido = getByKey(id);
		delete(resPedido);
	}
}