package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Pessoa;

@Repository("pessoaDao")
public class PessoaDaoImpl extends AbstractDao<Integer, Pessoa> implements PessoaDao {

	static final Logger logger = LoggerFactory.getLogger(PessoaDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Pessoa> lista = (List<Pessoa>) criteria.list();

		return lista;
	}
	
	public Pessoa findById(int id) {
		Pessoa pessoa = getByKey(id);
		return pessoa;
	}
	
	public void save(Pessoa pessoa) {
		persist(pessoa);
	}
	
	public void update(Pessoa pessoa) {
		persistUpdate(pessoa);
	}

	public void deleteById(int id) {
		Pessoa pessoa = getByKey(id);
		delete(pessoa);
	}
}