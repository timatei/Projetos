package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.AjusteEstoqueItem;

@Repository("ajusteEstoqueItemDao")
public class AjusteEstoqueItemDaoImpl extends AbstractDao<Integer, AjusteEstoqueItem> implements AjusteEstoqueItemDao {

	static final Logger logger = LoggerFactory.getLogger(AjusteEstoqueItemDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<AjusteEstoqueItem> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<AjusteEstoqueItem> lista = (List<AjusteEstoqueItem>) criteria.list();

		return lista;
	}
	
	public AjusteEstoqueItem findById(int id) {
		AjusteEstoqueItem ajusteEstoqueItem = getByKey(id);
		return ajusteEstoqueItem;
	}
	
	public void save(AjusteEstoqueItem ajusteEstoqueItem) {
		persist(ajusteEstoqueItem);
	}
	
	public void update(AjusteEstoqueItem ajusteEstoqueItem) {
		persistUpdate(ajusteEstoqueItem);
	}

	public void deleteById(int id) {
		AjusteEstoqueItem ajusteEstoqueItem = getByKey(id);
		delete(ajusteEstoqueItem);
	}
}