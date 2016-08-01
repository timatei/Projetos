package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ResGarcon;

@Repository("resGarconDao")
public class ResGarconDaoImpl extends AbstractDao<Integer, ResGarcon> implements ResGarconDao {

	static final Logger logger = LoggerFactory.getLogger(ResGarconDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ResGarcon> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ResGarcon> lista = (List<ResGarcon>) criteria.list();

		return lista;
	}
	
	public ResGarcon findById(int id) {
		ResGarcon resGarcon = getByKey(id);
		return resGarcon;
	}
	
	public void save(ResGarcon resGarcon) {
		persist(resGarcon);
	}
	
	public void update(ResGarcon resGarcon) {
		persistUpdate(resGarcon);
	}

	public void deleteById(int id) {
		ResGarcon resGarcon = getByKey(id);
		delete(resGarcon);
	}
}