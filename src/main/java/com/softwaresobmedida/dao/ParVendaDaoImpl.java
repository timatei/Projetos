package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ParVenda;

@Repository("parVendaDao")
public class ParVendaDaoImpl extends AbstractDao<Integer, ParVenda> implements ParVendaDao {

	static final Logger logger = LoggerFactory.getLogger(ParVendaDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ParVenda> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ParVenda> lista = (List<ParVenda>) criteria.list();

		return lista;
	}
	
	public ParVenda findById(int id) {
		ParVenda parVenda = getByKey(id);
		return parVenda;
	}
	
	public void save(ParVenda parVenda) {
		persist(parVenda);
	}
	
	public void update(ParVenda parVenda) {
		persistUpdate(parVenda);
	}

	public void deleteById(int id) {
		ParVenda parVenda = getByKey(id);
		delete(parVenda);
	}
}