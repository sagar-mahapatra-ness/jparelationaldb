package com.webapp.domain;

public class Product  extends AbstractEntity{
	private String name;
	private String description;
	private String attribuets;
	private Number price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAttribuets() {
		return attribuets;
	}

	public void setAttribuets(String attribuets) {
		this.attribuets = attribuets;
	}

	public Number getPrice() {
		return price;
	}

	public void setPrice(Number price) {
		this.price = price;
	}

}
