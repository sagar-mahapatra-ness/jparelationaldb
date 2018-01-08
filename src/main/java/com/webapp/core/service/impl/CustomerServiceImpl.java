package com.webapp.core.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.core.domain.Customer;
import com.webapp.core.repository.CustomerRepository;
import com.webapp.core.service.ICustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	public static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		logger.debug("  customer Fetched ",customers.size());
		return customers;
	}

}
