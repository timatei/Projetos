package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Formapagamento;

@Repository("formapagamentoDao")
public class FormapagamentoDaoImpl extends AbstractDao<Integer, Formapagamento> implements FormapagamentoDao {

	static final Logger logger = LoggerFactory.getLogger(FormapagamentoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Formapagamento> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Formapagamento> lista = (List<Formapagamento>) criteria.list();

		return lista;
	}
	
	public Formapagamento findById(int id) {
		Formapagamento formapagamento = getByKey(id);
		return formapagamento;
	}
	
	public void save(Formapagamento formapagamento) {
		persist(formapagamento);
	}
	
	public void update(Formapagamento formapagamento) {
		persistUpdate(formapagamento);
	}

	public void deleteById(int id) {
		Formapagamento formapagamento = getByKey(id);
		delete(formapagamento);
	}
}