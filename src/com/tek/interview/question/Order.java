package com.tek.interview.question;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<OrderLine> orderLines;

	private String orderName;

	public Order(String orderName) {
		this.orderName = orderName;
		this.orderLines = new ArrayList<>();
	}

	public void add(OrderLine o) {
		if (o == null) {
			System.err.println("ERROR - Order is NULL");
			throw new IllegalArgumentException("Order is NULL");
		}
		orderLines.add(o);
	}

	public int size() {
		return orderLines.size();
	}

	public OrderLine get(int i) {
		return orderLines.get(i);
	}

	public String getOrderName() {
		return orderName;
	}

}