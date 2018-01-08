package com.webapp.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import javax.persistence.Id;


@Entity(name="listitems")
public class LineItem  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@ManyToOne
	public Product product;
	
	@Column(nullable = false)
	public Number quantity;
	
	@Column(nullable = false)
	public Number price;
	
	

}
