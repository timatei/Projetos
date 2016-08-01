package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ProdutoGrupoSubGrp;

@Repository("produtoGrupoSubGrpDao")
public class ProdutoGrupoSubGrpDaoImpl extends AbstractDao<Integer, ProdutoGrupoSubGrp> implements ProdutoGrupoSubGrpDao {

	static final Logger logger = LoggerFactory.getLogger(ProdutoGrupoSubGrpDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ProdutoGrupoSubGrp> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ProdutoGrupoSubGrp> lista = (List<ProdutoGrupoSubGrp>) criteria.list();

		return lista;
	}
	
	public ProdutoGrupoSubGrp findById(int id) {
		ProdutoGrupoSubGrp produtoGrupoSubGrp = getByKey(id);
		return produtoGrupoSubGrp;
	}
	
	public void save(ProdutoGrupoSubGrp produtoGrupoSubGrp) {
		persist(produtoGrupoSubGrp);
	}
	
	public void update(ProdutoGrupoSubGrp produtoGrupoSubGrp) {
		persistUpdate(produtoGrupoSubGrp);
	}

	public void deleteById(int id) {
		ProdutoGrupoSubGrp produtoGrupoSubGrp = getByKey(id);
		delete(produtoGrupoSubGrp);
	}
}