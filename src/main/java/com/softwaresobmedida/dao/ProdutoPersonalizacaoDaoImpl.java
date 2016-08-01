package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ProdutoPersonalizacao;

@Repository("produtoPersonalizacaoDao")
public class ProdutoPersonalizacaoDaoImpl extends AbstractDao<Integer, ProdutoPersonalizacao> implements ProdutoPersonalizacaoDao {

	static final Logger logger = LoggerFactory.getLogger(ProdutoPersonalizacaoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ProdutoPersonalizacao> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ProdutoPersonalizacao> lista = (List<ProdutoPersonalizacao>) criteria.list();

		return lista;
	}
	
	public ProdutoPersonalizacao findById(int id) {
		ProdutoPersonalizacao produtoPersonalizacao = getByKey(id);
		return produtoPersonalizacao;
	}
	
	public void save(ProdutoPersonalizacao produtoPersonalizacao) {
		persist(produtoPersonalizacao);
	}
	
	public void update(ProdutoPersonalizacao produtoPersonalizacao) {
		persistUpdate(produtoPersonalizacao);
	}

	public void deleteById(int id) {
		ProdutoPersonalizacao produtoPersonalizacao = getByKey(id);
		delete(produtoPersonalizacao);
	}
}