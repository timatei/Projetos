package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.NfCompra;

@Repository("nfCompraDao")
public class NfCompraDaoImpl extends AbstractDao<Integer, NfCompra> implements NfCompraDao {

	static final Logger logger = LoggerFactory.getLogger(NfCompraDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<NfCompra> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<NfCompra> lista = (List<NfCompra>) criteria.list();

		return lista;
	}
	
	public NfCompra findById(int id) {
		NfCompra nfCompra = getByKey(id);
		return nfCompra;
	}
	
	public void save(NfCompra nfCompra) {
		persist(nfCompra);
	}
	
	public void update(NfCompra nfCompra) {
		persistUpdate(nfCompra);
	}

	public void deleteById(int id) {
		NfCompra nfCompra = getByKey(id);
		delete(nfCompra);
	}
}