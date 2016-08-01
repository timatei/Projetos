package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.Vendedor;

@Repository("vendedorDao")
public class VendedorDaoImpl extends AbstractDao<Integer, Vendedor> implements VendedorDao {

	static final Logger logger = LoggerFactory.getLogger(VendedorDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<Vendedor> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Vendedor> lista = (List<Vendedor>) criteria.list();

		return lista;
	}
	
	public Vendedor findById(int id) {
		Vendedor vendedor = getByKey(id);
		return vendedor;
	}
	
	public void save(Vendedor vendedor) {
		persist(vendedor);
	}
	
	public void update(Vendedor vendedor) {
		persistUpdate(vendedor);
	}

	public void deleteById(int id) {
		Vendedor vendedor = getByKey(id);
		delete(vendedor);
	}
}