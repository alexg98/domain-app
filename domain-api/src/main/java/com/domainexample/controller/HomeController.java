package com.domainexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domainexample.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	private HomeService homeService; 
	
	@RequestMapping("/")
	public String index() {
		return homeService.getFirstProduct();
	}
}
