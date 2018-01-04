package com.webapp.core.domain;

import javax.persistence.Entity;

@Entity
public class Customer extends AbstractEntity{
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
