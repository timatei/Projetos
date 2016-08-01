package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ContasBaixas;

@Repository("contasBaixasDao")
public class ContasBaixasDaoImpl extends AbstractDao<Integer, ContasBaixas> implements ContasBaixasDao {

	static final Logger logger = LoggerFactory.getLogger(ContasBaixasDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ContasBaixas> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ContasBaixas> lista = (List<ContasBaixas>) criteria.list();

		return lista;
	}
	
	public ContasBaixas findById(int id) {
		ContasBaixas contasBaixas = getByKey(id);
		return contasBaixas;
	}
	
	public void save(ContasBaixas contasBaixas) {
		persist(contasBaixas);
	}
	
	public void update(ContasBaixas contasBaixas) {
		persistUpdate(contasBaixas);
	}

	public void deleteById(int id) {
		ContasBaixas contasBaixas = getByKey(id);
		delete(contasBaixas);
	}
}