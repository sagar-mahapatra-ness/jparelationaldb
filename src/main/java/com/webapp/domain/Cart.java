package com.webapp.domain;

import java.util.List;

public class Cart extends AbstractEntity{
	private List<LineItem> lineItems;

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}
}
