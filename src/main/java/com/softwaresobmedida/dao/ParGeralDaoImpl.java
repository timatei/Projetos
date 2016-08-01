package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ParGeral;

@Repository("parGeralDao")
public class ParGeralDaoImpl extends AbstractDao<Integer, ParGeral> implements ParGeralDao {

	static final Logger logger = LoggerFactory.getLogger(ParGeralDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ParGeral> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ParGeral> lista = (List<ParGeral>) criteria.list();

		return lista;
	}
	
	public ParGeral findById(int id) {
		ParGeral parGeral = getByKey(id);
		return parGeral;
	}
	
	public void save(ParGeral parGeral) {
		persist(parGeral);
	}
	
	public void update(ParGeral parGeral) {
		persistUpdate(parGeral);
	}

	public void deleteById(int id) {
		ParGeral parGeral = getByKey(id);
		delete(parGeral);
	}
}