package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.CentCusto;

@Repository("centCustoDao")
public class CentCustoDaoImpl extends AbstractDao<Integer, CentCusto> implements CentCustoDao {

	static final Logger logger = LoggerFactory.getLogger(CentCustoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<CentCusto> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<CentCusto> lista = (List<CentCusto>) criteria.list();

		return lista;
	}
	
	public CentCusto findById(int id) {
		CentCusto centCusto = getByKey(id);
		return centCusto;
	}
	
	public void save(CentCusto centCusto) {
		persist(centCusto);
	}
	
	public void update(CentCusto centCusto) {
		persistUpdate(centCusto);
	}

	public void deleteById(int id) {
		CentCusto centCusto = getByKey(id);
		delete(centCusto);
	}
}