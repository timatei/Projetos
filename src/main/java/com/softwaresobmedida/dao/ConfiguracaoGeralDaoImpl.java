package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.softwaresobmedida.model.ConfiguracaoGeral;

@Repository("configuracaoGeralDao")
public class ConfiguracaoGeralDaoImpl extends AbstractDao<Integer, ConfiguracaoGeral> implements ConfiguracaoGeralDao {

	static final Logger logger = LoggerFactory.getLogger(ConfiguracaoGeralDaoImpl.class);
	
	@SuppressWarnings("unchecked")
	public List<ConfiguracaoGeral> findAll() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<ConfiguracaoGeral> lista = (List<ConfiguracaoGeral>) criteria.list();

		return lista;
	}
	
	public ConfiguracaoGeral findById(int id) {
		ConfiguracaoGeral configuracaoGeral = getByKey(id);
		return configuracaoGeral;
	}
	
	public void save(ConfiguracaoGeral configuracaoGeral) {
		persist(configuracaoGeral);
	}
	
	public void update(ConfiguracaoGeral configuracaoGeral) {
		persistUpdate(configuracaoGeral);
	}

	public void deleteById(int id) {
		ConfiguracaoGeral configuracaoGeral = getByKey(id);
		delete(configuracaoGeral);
	}
}