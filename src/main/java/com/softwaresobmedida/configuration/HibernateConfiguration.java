package com.softwaresobmedida.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.MultiTenancyStrategy;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

@Configuration
@EnableTransactionManagement
@ComponentScan({ "com.softwaresobmedida.configuration" })
@PropertySource(value = { "classpath:application.properties" })
public class HibernateConfiguration {

    @Autowired
    private Environment environment;

	@Autowired
	private MultiTenantConnectionProvider multiTenantConnectionProvider;

	@Autowired
	private CurrentTenantIdentifierResolver currentTenantIdentifierResolver;
    
    @Bean(name="sessionFactory")
    @Primary
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        //sessionFactory.setDataSource(dataSourceMaster());
        sessionFactory.setPackagesToScan(new String[] { "com.softwaresobmedida.model"});
        sessionFactory.setMultiTenantConnectionProvider(multiTenantConnectionProvider);
        sessionFactory.setHibernateProperties(hibernateProperties(true));
        return sessionFactory;
    }
    
	@Bean(name="transactionManager")
	@Primary
    @Autowired
    @Qualifier("sessionFactory")
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }	
    
    @Bean(name="sessionFactoryTeste")
    public LocalSessionFactoryBean sessionFactoryTeste() {
    	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSourceMaster());
        sessionFactory.setPackagesToScan(new String[] { "ssm.softwaresobmedida.framework" });
        sessionFactory.setHibernateProperties(hibernateProperties(false));
        return sessionFactory;
    }
    
    @Bean(name="transactionManagerTeste")
    @Autowired
    @Qualifier("sessionFactoryTeste")
    public HibernateTransactionManager transactionManagerTeste(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }
    
    private Properties hibernateProperties(Boolean tenant) {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        if (tenant) {
	        properties.put(org.hibernate.cfg.Environment.MULTI_TENANT, MultiTenancyStrategy.DATABASE);
	        properties.put(org.hibernate.cfg.Environment.MULTI_TENANT_CONNECTION_PROVIDER, multiTenantConnectionProvider);
	        properties.put(org.hibernate.cfg.Environment.MULTI_TENANT_IDENTIFIER_RESOLVER, currentTenantIdentifierResolver);
        }
        //properties.put("hibernate.connection.lc_ctype", "WIN1252");
        //properties.put("hibernate.connection.charSet", "WIN1252");
        return properties;
    }
    	
	@Bean(name = "dataSourceMaster")
	public DataSource dataSourceMaster() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
	}
    
	@Bean(name = "dataSource1") //@Bean(name = {"dataSource", "dataSource1"})
	public DataSource dataSource1() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("spring.additional.datasource1"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
	}

	@Bean(name = "dataSource2")
	public DataSource dataSource2() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("spring.additional.datasource2"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
	}	
}