package co.com.coomeva.sipas.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/*
 * see https://www.youtube.com/watch?v=egXtoL5Kg08
 * 	   https://www.youtube.com/watch?v=dTAgI_UsqMg
 * 
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	private static final String USER = "USER";
	private static final String ADMIN = "ADMIN";
	
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests()
			.antMatchers("/getUsers").hasRole(USER)
			.antMatchers("/private").hasRole("ADMIN")
			.and()
			.formLogin();		
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("alexg").password("alexg98").roles(ADMIN)
			.and()
			.withUser("root").password("root").roles(ADMIN,ADMIN);
	}
}
