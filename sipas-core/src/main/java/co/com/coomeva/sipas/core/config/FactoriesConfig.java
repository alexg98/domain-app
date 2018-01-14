package co.com.coomeva.sipas.core.config;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import co.com.coomeva.sipas.core.factory.ValidadorProteccionesFactory;

@Configuration
@EnableTransactionManagement
public class FactoriesConfig {

	@Bean
	public ServiceLocatorFactoryBean slfbValidadorProteccionesFactory() {  
		ServiceLocatorFactoryBean slfb = new ServiceLocatorFactoryBean();
		slfb.setServiceLocatorInterface(ValidadorProteccionesFactory.class);
		return slfb;
	}
}
