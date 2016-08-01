package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.GrupoPersonalizacaoItem;

@Repository("grupoPersonalizacaoItemDao")
public class GrupoPersonalizacaoItemDaoImpl extends AbstractDao<Integer, GrupoPersonalizacaoItem> implements GrupoPersonalizacaoItemDao {

	static final Logger logger = LoggerFactory.getLogger(GrupoPersonalizacaoItemDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<GrupoPersonalizacaoItem> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<GrupoPersonalizacaoItem> lista = (List<GrupoPersonalizacaoItem>) criteria.list();

		return lista;
	}
	
	public GrupoPersonalizacaoItem findById(int id) {
		GrupoPersonalizacaoItem grupoPersonalizacaoItem = getByKey(id);
		return grupoPersonalizacaoItem;
	}
	
	public void save(GrupoPersonalizacaoItem grupoPersonalizacaoItem) {
		persist(grupoPersonalizacaoItem);
	}
	
	public void update(GrupoPersonalizacaoItem grupoPersonalizacaoItem) {
		persistUpdate(grupoPersonalizacaoItem);
	}

	public void deleteById(int id) {
		GrupoPersonalizacaoItem grupoPersonalizacaoItem = getByKey(id);
		delete(grupoPersonalizacaoItem);
	}
}