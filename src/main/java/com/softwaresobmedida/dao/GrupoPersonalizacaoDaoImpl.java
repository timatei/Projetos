package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.GrupoPersonalizacao;

@Repository("grupoPersonalizacaoDao")
public class GrupoPersonalizacaoDaoImpl extends AbstractDao<Integer, GrupoPersonalizacao> implements GrupoPersonalizacaoDao {

	static final Logger logger = LoggerFactory.getLogger(GrupoPersonalizacaoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<GrupoPersonalizacao> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<GrupoPersonalizacao> lista = (List<GrupoPersonalizacao>) criteria.list();

		return lista;
	}
	
	public GrupoPersonalizacao findById(int id) {
		GrupoPersonalizacao grupoPersonalizacao = getByKey(id);
		return grupoPersonalizacao;
	}
	
	public void save(GrupoPersonalizacao grupoPersonalizacao) {
		persist(grupoPersonalizacao);
	}
	
	public void update(GrupoPersonalizacao grupoPersonalizacao) {
		persistUpdate(grupoPersonalizacao);
	}

	public void deleteById(int id) {
		GrupoPersonalizacao grupoPersonalizacao = getByKey(id);
		delete(grupoPersonalizacao);
	}
}