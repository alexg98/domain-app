package co.com.coomeva.sipas.core.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@PropertySource(value = { "classpath:db2.properties" })
public class HibernateConfig {

	@Autowired
	private Environment env;
	
	@Autowired
	private ResourceLoader rl;

	/**
	 * Initialize dataSource
	 * 
	 * @return DataSource
	 */
	@Bean(name = "dataSource")	
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("datasource.driver"));
		dataSource.setUrl(env.getRequiredProperty("datasource.url"));
		dataSource.setUsername(env.getRequiredProperty("datasource.username"));
		dataSource.setPassword(env.getRequiredProperty("datasource.password"));
		return dataSource;		
	}	
	
	@Bean(name = "sessionFactory")	
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan(new String[] { "com.domainexample.model" });
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
	@Bean(name ="hibernateTransactionManager")		
	public HibernateTransactionManager transactionManager2(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
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
		
		properties.put(AvailableSettings.FLUSH_BEFORE_COMPLETION, env.getRequiredProperty("hibernate.transaction.flush_before_completion"));
		//properties.put(AvailableSettings.USE_QUERY_CACHE, env.getRequiredProperty("hibernate.cache.use_query_cache"));
		//properties.put(AvailableSettings.USE_SECOND_LEVEL_CACHE, env.getRequiredProperty("hibernate.cache.use_second_level_cache"));
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
	                .getResources("classpath:/hibernate/**/*.hbm.xml");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return resources;
	}
}
