package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Banco;

@Repository("bancoDao")
public class BancoDaoImpl extends AbstractDao<Integer, Banco> implements BancoDao {

	static final Logger logger = LoggerFactory.getLogger(BancoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Banco> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Banco> lista = (List<Banco>) criteria.list();

		return lista;
	}
	
	public Banco findById(int id) {
		Banco banco = getByKey(id);
		return banco;
	}
	
	public void save(Banco banco) {
		persist(banco);
	}
	
	public void update(Banco banco) {
		persistUpdate(banco);
	}

	public void deleteById(int id) {
		Banco banco = getByKey(id);
		delete(banco);
	}
}