package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Moeda;

@Repository("moedaDao")
public class MoedaDaoImpl extends AbstractDao<Integer, Moeda> implements MoedaDao {

	static final Logger logger = LoggerFactory.getLogger(MoedaDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Moeda> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Moeda> lista = (List<Moeda>) criteria.list();

		return lista;
	}
	
	public Moeda findById(int id) {
		Moeda moeda = getByKey(id);
		return moeda;
	}
	
	public void save(Moeda moeda) {
		persist(moeda);
	}
	
	public void update(Moeda moeda) {
		persistUpdate(moeda);
	}

	public void deleteById(int id) {
		Moeda moeda = getByKey(id);
		delete(moeda);
	}
}