package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ProdutoGrupo;

@Repository("produtoGrupoDao")
public class ProdutoGrupoDaoImpl extends AbstractDao<Integer, ProdutoGrupo> implements ProdutoGrupoDao {

	static final Logger logger = LoggerFactory.getLogger(ProdutoGrupoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ProdutoGrupo> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ProdutoGrupo> lista = (List<ProdutoGrupo>) criteria.list();

		return lista;
	}
	
	public ProdutoGrupo findById(int id) {
		ProdutoGrupo produtoGrupo = getByKey(id);
		return produtoGrupo;
	}
	
	public void save(ProdutoGrupo produtoGrupo) {
		persist(produtoGrupo);
	}
	
	public void update(ProdutoGrupo produtoGrupo) {
		persistUpdate(produtoGrupo);
	}

	public void deleteById(int id) {
		ProdutoGrupo produtoGrupo = getByKey(id);
		delete(produtoGrupo);
	}
}