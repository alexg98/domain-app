package co.com.coomeva.sipas.bpm.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
 * see https://github.com/bytestree/spring4-hibernate5-example
 */
@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:application.properties" })
public class HibernateBpmConfig {

	@Autowired
	private Environment env;
	
	@Autowired
	private ResourceLoader rl;

	/**
	 * Initialize dataSource
	 * 
	 * @return DataSource
	 */
	@Primary
	@Bean(name = "dataSourceBpm")
	public DataSource getDataSourceBpm() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("spring.datasource.driver"));
		dataSource.setUrl(env.getRequiredProperty("spring.datasource.url"));
		dataSource.setUsername(env.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(env.getRequiredProperty("spring.datasource.password"));
		return dataSource;
	}	
	@Primary
	@Bean(name = "sessionBpmFactory")
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSourceBpm());
		sessionFactory.setPackagesToScan(new String[] { "co.com.coomeva.sipas.bpm.model" });
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setMappingLocations(loadResources());
		return sessionFactory;
	}
	/**
	 * Initialize Transaction Manager
	 * 
	 * @param sessionFactory
	 * @return HibernateTransactionManager
	 */
	@Primary
	@Bean(name = "hibernateBpmTransactionManager")
	public HibernateTransactionManager transactionManagerBpm(@Qualifier("sessionBpmFactory") SessionFactory sessionBpmFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionBpmFactory);
		return txManager;
	}
	/**
	 * Initialize hibernate properties
	 * 
	 * @return Properties
	 */
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put(AvailableSettings.DIALECT, env.getRequiredProperty("hibernate.dialect"));
		properties.put(AvailableSettings.SHOW_SQL, env.getRequiredProperty("hibernate.show_sql"));
		properties.put(AvailableSettings.STATEMENT_BATCH_SIZE, env.getRequiredProperty("hibernate.batch.size"));
		//properties.put(AvailableSettings.HBM2DDL_AUTO, env.getRequiredProperty("hibernate.hbm2ddl.auto"));
		properties.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, env.getRequiredProperty("hibernate.current.session.context.class"));
		return properties;
	}
	/**
	 * Load all file mapping
	 * @return
	 */
	public Resource[] loadResources() {
	    Resource[] resources = null;
	    try {
	        resources = ResourcePatternUtils.getResourcePatternResolver(rl)
	                .getResources("classpath:/hibernate/bpm/*.hbm.xml");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return resources;
	}
}
