package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ProdutoUnidade;

@Repository("produtoUnidadeDao")
public class ProdutoUnidadeDaoImpl extends AbstractDao<Integer, ProdutoUnidade> implements ProdutoUnidadeDao {

	static final Logger logger = LoggerFactory.getLogger(ProdutoUnidadeDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ProdutoUnidade> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ProdutoUnidade> lista = (List<ProdutoUnidade>) criteria.list();

		return lista;
	}
	
	public ProdutoUnidade findById(int id) {
		ProdutoUnidade produtoUnidade = getByKey(id);
		return produtoUnidade;
	}
	
	public void save(ProdutoUnidade produtoUnidade) {
		persist(produtoUnidade);
	}
	
	public void update(ProdutoUnidade produtoUnidade) {
		persistUpdate(produtoUnidade);
	}

	public void deleteById(int id) {
		ProdutoUnidade produtoUnidade = getByKey(id);
		delete(produtoUnidade);
	}
}