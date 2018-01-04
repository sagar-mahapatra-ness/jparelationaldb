package com.webapp.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.core.domain.Customer;
import com.webapp.core.domain.EmailAddress;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Long>{
	Customer findByEmailAddress(EmailAddress emailAddress);
}
