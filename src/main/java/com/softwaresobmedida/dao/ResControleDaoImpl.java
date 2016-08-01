package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ResControle;

@Repository("resControleDao")
public class ResControleDaoImpl extends AbstractDao<Integer, ResControle> implements ResControleDao {

	static final Logger logger = LoggerFactory.getLogger(ResControleDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ResControle> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ResControle> lista = (List<ResControle>) criteria.list();

		return lista;
	}
	
	public ResControle findById(int id) {
		ResControle resControle = getByKey(id);
		return resControle;
	}
	
	public void save(ResControle resControle) {
		persist(resControle);
	}
	
	public void update(ResControle resControle) {
		persistUpdate(resControle);
	}

	public void deleteById(int id) {
		ResControle resControle = getByKey(id);
		delete(resControle);
	}
}