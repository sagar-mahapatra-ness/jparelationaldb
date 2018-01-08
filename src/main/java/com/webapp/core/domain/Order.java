package com.webapp.core.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import javax.persistence.Id;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity(name="orders")
public class Order{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	public Date date;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "order_id")
	public List<LineItem> items;
	
	@ManyToOne(optional = false)
	public Customer customer;
	
	@ManyToOne
	public Address billingAddress;
	
	@ManyToOne
	public Address shoppingAddress;
	
	public String status;
	
}
