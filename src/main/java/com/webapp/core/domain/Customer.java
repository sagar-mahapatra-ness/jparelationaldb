package com.webapp.core.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;


@Entity(name="Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;
	
	@Column(unique = true)
	private EmailAddress emailAddress;
	
	@OneToMany(cascade=CascadeType.ALL ,orphanRemoval=true)
	@JoinColumn(name="customer_id")
	private Set<Address> address;

	
}
