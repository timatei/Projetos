package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.AjusteEstoque;

@Repository("ajusteEstoqueDao")
public class AjusteEstoqueDaoImpl extends AbstractDao<Integer, AjusteEstoque> implements AjusteEstoqueDao {

	static final Logger logger = LoggerFactory.getLogger(AjusteEstoqueDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<AjusteEstoque> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<AjusteEstoque> lista = (List<AjusteEstoque>) criteria.list();

		return lista;
	}
	
	public AjusteEstoque findById(int id) {
		AjusteEstoque ajusteEstoque = getByKey(id);
		return ajusteEstoque;
	}
	
	public void save(AjusteEstoque ajusteEstoque) {
		persist(ajusteEstoque);
	}
	
	public void update(AjusteEstoque ajusteEstoque) {
		persistUpdate(ajusteEstoque);
	}

	public void deleteById(int id) {
		AjusteEstoque ajusteEstoque = getByKey(id);
		delete(ajusteEstoque);
	}
}