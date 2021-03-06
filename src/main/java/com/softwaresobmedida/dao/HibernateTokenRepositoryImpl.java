package com.softwaresobmedida.dao;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ssm.softwaresobmedida.framework.PersistentLogin;

@Repository("tokenRepositoryDao")
@Transactional(transactionManager="transactionManagerMaster")
public class HibernateTokenRepositoryImpl implements PersistentTokenRepository {

	static final Logger logger = LoggerFactory.getLogger(HibernateTokenRepositoryImpl.class);

	public PersistentLogin getByKey(String key) {
		return (PersistentLogin) getSession().get(PersistentLogin.class, key);
	}

	public void persist(PersistentLogin entity) {
		getSession().persist(entity);
	}

	public void persistUpdate(PersistentLogin entity) {
		getSession().update(entity);
	}

	public void delete(PersistentLogin entity) {
		getSession().delete(entity);
	}
	
	protected Criteria createEntityCriteria(){
		return getSession().createCriteria(PersistentLogin.class);
	}
	
	@Override
	public void createNewToken(PersistentRememberMeToken token) {
		logger.info("Creating Token for user : {}", token.getUsername());
		PersistentLogin persistentLogin = new PersistentLogin();
		persistentLogin.setUsername(token.getUsername());
		persistentLogin.setSeries(token.getSeries());
		persistentLogin.setToken(token.getTokenValue());
		persistentLogin.setLast_used(token.getDate());
		persist(persistentLogin);

	}

	@Override
	public PersistentRememberMeToken getTokenForSeries(String seriesId) {
		logger.info("Fetch Token if any for seriesId : {}", seriesId);
		try {
			Criteria crit = createEntityCriteria();
			crit.add(Restrictions.eq("series", seriesId));
			PersistentLogin persistentLogin = (PersistentLogin) crit.uniqueResult();

			return new PersistentRememberMeToken(persistentLogin.getUsername(), persistentLogin.getSeries(),
					persistentLogin.getToken(), persistentLogin.getLast_used());
		} catch (Exception e) {
			logger.info("Token not found...");
			return null;
		}
	}

	@Override
	public void removeUserTokens(String username) {
		logger.info("Removing Token if any for user : {}", username);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", username));
		PersistentLogin persistentLogin = (PersistentLogin) crit.uniqueResult();
		if (persistentLogin != null) {
			logger.info("rememberMe was selected");
			delete(persistentLogin);
		}

	}

	@Override
	public void updateToken(String seriesId, String tokenValue, Date lastUsed) {
		logger.info("Updating Token for seriesId : {}", seriesId);
		PersistentLogin persistentLogin = getByKey(seriesId);
		persistentLogin.setToken(tokenValue);
		persistentLogin.setLast_used(lastUsed);
		persistUpdate(persistentLogin);
	}

	@Autowired
	@Qualifier("sessionFactoryMaster")
	private SessionFactory sessionFactoryMaster;
	
	public SessionFactory getSessionFactory() {
		return sessionFactoryMaster;
	}
	
	public Session getSession() {
		return getSessionFactory().getCurrentSession();//.withOptions().tenantIdentifier("MASTER").openSession();
	}
}

/*
INSERT INTO SSM_USER (SSM_USER_ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD_USER,
    SSO_ID)
VALUES (
    gen_id(GEN_USER, 1), 
    'izaiasavila@gmail.com', 
    'Izaias', 
    'Avila', 
    '$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 
    'izaias'
);

INSERT INTO SSM_USER_PROFILE (SSM_USER_PROFILE_ID, TYPE_USER)
VALUES (
    GEN_ID(GEN_USER_PROFILE, 1), 
    'USER'
);

INSERT INTO SSM_USER_PROFILE (SSM_USER_PROFILE_ID, TYPE_USER)
VALUES (
    GEN_ID(GEN_USER_PROFILE, 1), 
    'ADMIN'
);

INSERT INTO SSM_USER_PROFILE (SSM_USER_PROFILE_ID, TYPE_USER)
VALUES (
    GEN_ID(GEN_USER_PROFILE, 1), 
    'DBA'
);

INSERT INTO SSM_USER_USER_PROFILE (SSM_USER_ID, SSM_USER_PROFILE_ID)
VALUES (
    1, 
    2
);

*/