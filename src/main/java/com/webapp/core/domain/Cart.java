package com.webapp.core.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;



@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "order_id")
	public List<LineItem> items;

	@ManyToOne(optional = false)
	public Customer customer;
}
