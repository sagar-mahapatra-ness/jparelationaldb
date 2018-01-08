package com.webapp.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.core.domain.Customer;
import com.webapp.core.service.ICustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerResource {
	
	public static Logger logger = LoggerFactory.getLogger(CustomerResource.class);
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping(path="/all")
	public  @ResponseBody ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		ResponseEntity<List<Customer>> response = new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
		return response;
	}

}
