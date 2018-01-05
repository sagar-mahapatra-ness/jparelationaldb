package com.webapp.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.core.domain.Customer;
import com.webapp.core.repository.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomerResource {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping(path="/all")
	public  @ResponseBody ResponseEntity<List<Customer>> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		ResponseEntity<List<Customer>> response = new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
		return response;
	}

}
