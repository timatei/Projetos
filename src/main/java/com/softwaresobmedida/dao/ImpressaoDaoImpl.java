package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Impressao;

@Repository("impressaoDao")
public class ImpressaoDaoImpl extends AbstractDao<Integer, Impressao> implements ImpressaoDao {

	static final Logger logger = LoggerFactory.getLogger(ImpressaoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Impressao> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Impressao> lista = (List<Impressao>) criteria.list();

		return lista;
	}
	
	public Impressao findById(int id) {
		Impressao impressao = getByKey(id);
		return impressao;
	}
	
	public void save(Impressao impressao) {
		persist(impressao);
	}
	
	public void update(Impressao impressao) {
		persistUpdate(impressao);
	}

	public void deleteById(int id) {
		Impressao impressao = getByKey(id);
		delete(impressao);
	}
}