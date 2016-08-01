package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ParRestaurante;

@Repository("parRestauranteDao")
public class ParRestauranteDaoImpl extends AbstractDao<Integer, ParRestaurante> implements ParRestauranteDao {

	static final Logger logger = LoggerFactory.getLogger(ParRestauranteDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ParRestaurante> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ParRestaurante> lista = (List<ParRestaurante>) criteria.list();

		return lista;
	}
	
	public ParRestaurante findById(int id) {
		ParRestaurante parRestaurante = getByKey(id);
		return parRestaurante;
	}
	
	public void save(ParRestaurante parRestaurante) {
		persist(parRestaurante);
	}
	
	public void update(ParRestaurante parRestaurante) {
		persistUpdate(parRestaurante);
	}

	public void deleteById(int id) {
		ParRestaurante parRestaurante = getByKey(id);
		delete(parRestaurante);
	}
}