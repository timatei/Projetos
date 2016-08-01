package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Contas;

@Repository("contasDao")
public class ContasDaoImpl extends AbstractDao<Integer, Contas> implements ContasDao {

	static final Logger logger = LoggerFactory.getLogger(ContasDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Contas> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Contas> lista = (List<Contas>) criteria.list();

		return lista;
	}
	
	public Contas findById(int id) {
		Contas contas = getByKey(id);
		return contas;
	}
	
	public void save(Contas contas) {
		persist(contas);
	}
	
	public void update(Contas contas) {
		persistUpdate(contas);
	}

	public void deleteById(int id) {
		Contas contas = getByKey(id);
		delete(contas);
	}
}