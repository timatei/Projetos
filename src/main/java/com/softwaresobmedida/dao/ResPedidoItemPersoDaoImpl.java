package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ResPedidoItemPerso;

@Repository("resPedidoItemPersoDao")
public class ResPedidoItemPersoDaoImpl extends AbstractDao<Integer, ResPedidoItemPerso> implements ResPedidoItemPersoDao {

	static final Logger logger = LoggerFactory.getLogger(ResPedidoItemPersoDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ResPedidoItemPerso> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ResPedidoItemPerso> lista = (List<ResPedidoItemPerso>) criteria.list();

		return lista;
	}
	
	public ResPedidoItemPerso findById(int id) {
		ResPedidoItemPerso resPedidoItemPerso = getByKey(id);
		return resPedidoItemPerso;
	}
	
	public void save(ResPedidoItemPerso resPedidoItemPerso) {
		persist(resPedidoItemPerso);
	}
	
	public void update(ResPedidoItemPerso resPedidoItemPerso) {
		persistUpdate(resPedidoItemPerso);
	}

	public void deleteById(int id) {
		ResPedidoItemPerso resPedidoItemPerso = getByKey(id);
		delete(resPedidoItemPerso);
	}
}