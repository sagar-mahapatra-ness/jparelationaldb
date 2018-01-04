package com.webapp.repository;

import com.webapp.domain.Customer;

public interface CustomerRepository {
	Customer save(Customer account);
	Customer findByEmailAddress(EmailAddress emailAddress);
}
