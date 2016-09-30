package com.tek.interview.question;

/*
 * represents an item, contains a price and a description.
 *
 */
public class Item {

	private String description;
	private float price;
	private boolean imported;

	public Item(String description, float price, boolean imported) {
		super();
		this.description = description;
		this.price = price;
		this.imported = imported;
	}

	public String getDescription() {
		return description;
	}

	public float getPrice() {
		return price;
	}

	public boolean isImported() {
		return imported;
	}

}