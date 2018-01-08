package com.webapp.core.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import javax.persistence.Id;


@Entity(name="Customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@Column(name = "first_name")
	public String firstName;
	
	@Column(name = "last_name")
	public String lastName;
	
	@Column(unique = true)
	public EmailAddress emailAddress;
	
	@ManyToOne
	public Address address;

	
}
