package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.CaixaAbertura;

@Repository("caixaAberturaDao")
public class CaixaAberturaDaoImpl extends AbstractDao<Integer, CaixaAbertura> implements CaixaAberturaDao {

	static final Logger logger = LoggerFactory.getLogger(CaixaAberturaDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<CaixaAbertura> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<CaixaAbertura> lista = (List<CaixaAbertura>) criteria.list();

		return lista;
	}
	
	public CaixaAbertura findById(int id) {
		CaixaAbertura caixaAbertura = getByKey(id);
		return caixaAbertura;
	}
	
	public void save(CaixaAbertura caixaAbertura) {
		persist(caixaAbertura);
	}
	
	public void update(CaixaAbertura caixaAbertura) {
		persistUpdate(caixaAbertura);
	}

	public void deleteById(int id) {
		CaixaAbertura caixaAbertura = getByKey(id);
		delete(caixaAbertura);
	}
}