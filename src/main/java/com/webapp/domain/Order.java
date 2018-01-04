package com.webapp.domain;

import java.util.Date;
import java.util.List;

public class Order extends AbstractEntity{
	private Date date;
	private List<LineItem> items;
	private Customer customer;
	private Address billingAddress;
	private Address shoppingAddress;
	private String status;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Address getShoppingAddress() {
		return shoppingAddress;
	}
	public void setShoppingAddress(Address shoppingAddress) {
		this.shoppingAddress = shoppingAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
