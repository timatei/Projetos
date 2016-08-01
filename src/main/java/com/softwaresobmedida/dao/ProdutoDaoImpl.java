package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Produto;

@Repository("produtoDao")
public class ProdutoDaoImpl extends AbstractDao<Integer, Produto> implements ProdutoDao {

	static final Logger logger = LoggerFactory.getLogger(ProdutoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Produto> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Produto> lista = (List<Produto>) criteria.list();

		return lista;
	}
	
	public Produto findById(int id) {
		Produto produto = getByKey(id);
		return produto;
	}
	
	public void save(Produto produto) {
		persist(produto);
	}
	
	public void update(Produto produto) {
		persistUpdate(produto);
	}

	public void deleteById(int id) {
		Produto produto = getByKey(id);
		delete(produto);
	}
}