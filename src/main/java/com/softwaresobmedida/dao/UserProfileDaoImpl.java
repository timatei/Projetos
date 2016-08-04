package com.softwaresobmedida.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ssm.softwaresobmedida.framework.UserProfile;

@Repository("userProfileDao")
@Transactional(transactionManager="transactionManagerTeste")
public class UserProfileDaoImpl implements UserProfileDao{

	public UserProfile getByKey(Integer key) {
		return (UserProfile) getSession().get(UserProfile.class, key);
	}

	public void persist(UserProfile entity) {
		getSession().persist(entity);
	}

	public void persistUpdate(UserProfile entity) {
		getSession().update(entity);
	}

	public void delete(UserProfile entity) {
		getSession().delete(entity);
	}
	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(UserProfile.class);
	}
	
	public UserProfile findById(int id) {
		return getByKey(id);
	}

	public UserProfile findByType(String type) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("type", type));
		return (UserProfile) crit.uniqueResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<UserProfile> findAll(){
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("type"));
		return (List<UserProfile>)crit.list();
	}

	@Autowired
	@Qualifier("sessionFactoryTeste")
	private SessionFactory sessionFactoryTeste;
	
	public SessionFactory getSessionFactory() {
		return sessionFactoryTeste;
	}
	
	public Session getSession() {
		return getSessionFactory().getCurrentSession();//.withOptions().tenantIdentifier("MASTER").openSession();
	}
}
