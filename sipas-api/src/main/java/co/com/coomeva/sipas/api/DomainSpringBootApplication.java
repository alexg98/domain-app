package co.com.coomeva.sipas.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"co.com.coomeva.sipas.core","co.com.coomeva.sipas.bpm","co.com.coomeva.sipas.api"})
public class DomainSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomainSpringBootApplication.class, args);
	}
}
