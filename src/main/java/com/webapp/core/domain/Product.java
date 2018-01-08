package com.webapp.core.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;


@Entity
public class Product  extends AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	
	@Column(nullable = false)
	public String name;
	
	@Column(nullable = false)
	public String description;
	
	@Column(nullable = false)
	public BigDecimal price;
	
	@ElementCollection
	public Map<String, String> attributes = new HashMap<String, String>();

	

}
