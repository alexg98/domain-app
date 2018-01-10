package com.domainexample.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.domainexample.service.UserService;
import com.domainexample.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.coomeva.sipas.core.model.User;


@RestController
public class UserController extends ParentException{

	@Autowired
	protected UserService userService;
	
	@Autowired
	protected ObjectMapper mapper;
	
	@RequestMapping(value ="/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) throws JsonParseException, JsonMappingException, IOException {
		User user = this.mapper.readValue(userJson, User.class);	
		if(!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Los campos obligatorios no esta diligenciados");
		}
		this.userService.save(user);
		return new RestResponse(HttpStatus.OK.value(), "Operacion exitosa");
	}
	
	@RequestMapping(value ="/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userService.findAll();
	} 
	
	@RequestMapping(value ="/deleteUser", method = RequestMethod.POST)
	public void deleteUser(@RequestBody String userJson) throws Exception {
		User user = this.mapper.readValue(userJson, User.class);
		
		if(user.getId() == null) {
			throw new Exception("El id esta nulo");
		}
		//this.userService.deleteUser(user.getId());
		this.userService.deleteUser(user);
		
	}
	
	@RequestMapping(value ="/public", method = RequestMethod.GET)
	public String getPublic() {
		this.userService.test(null);
		return "Acceso metodo publico";
	} 
	
	@RequestMapping(value ="/private", method = RequestMethod.GET)
	public String getPrivate() {
		return "Acceso metodo privado";
	} 
	
	@GetMapping
	public String Hello(@AuthenticationPrincipal final UserDetails userDetails) {
		String user = userDetails.getUsername();
		Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
		authorities.stream().
			forEach(System.out::println);
		return "Hello world";
	} 
	
	
	private boolean validate(User user) {
		boolean isValid = true;
		
		if(StringUtils.trimToNull(user.getFirstName()) == null ) {
			isValid = false;
		}
		
		if(StringUtils.trimToNull(user.getLastName()) == null ) {
			isValid = false;
		}
		return isValid;
	}
}