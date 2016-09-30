package com.tek.interview.question;

import java.text.DecimalFormat;
import java.util.List;

public class Calculator {
	public static final DecimalFormat TWO_DECIMAL_POINT_FORMAT = new DecimalFormat("###.##");

	public static double roundTo2Decimals(double val) {

		return Double.valueOf(TWO_DECIMAL_POINT_FORMAT.format(val));
	}

	/**
	 * receives a collection of orders. For each order, iterates on the order
	 * lines and calculate the total price which is the item's price * quantity
	 * * taxes.
	 * 
	 * For each order, print the total Sales Tax paid and Total price without
	 * taxes for this order
	 */
	public void calculate(List<Order> ordersList) {

		double grandtotal = 0;

		// Iterate through the orders
		for (Order order : ordersList) {
			System.out.println("*******" + order.getOrderName() + "*******");

			double totalTax = 0;
			double total = 0;

			// Iterate through the items in the order
			for (int i = 0; i < order.size(); i++) {

				// Calculate the taxes
				double tax = 0;
				OrderLine orderLine = order.get(i);
				int quantity = orderLine.getQuantity();
				Item orderLineItem = orderLine.getItem();
				String description = orderLineItem.getDescription();
				float price = orderLineItem.getPrice();
				float orderLinePrice = price * quantity;
				boolean isImported = orderLineItem.isImported();
				if (isImported) {
					tax = roundTo2Decimals(orderLinePrice * 0.15); // Extra 5%
																	// tax on
					// imported items
				} else {
					tax = roundTo2Decimals(orderLinePrice * 0.10);
				}

				// Calculate the total price
				double totalprice = orderLinePrice + (tax);

				// Print out the item's total price
				System.out.println(quantity + " " + description + ": " + roundTo2Decimals(totalprice));

				// Keep a running total
				totalTax += tax;
				total += orderLinePrice;
			}

			// Print out the total taxes
			System.out.println("Sales Tax: " + roundTo2Decimals(totalTax));

			// total = total + totalTax;

			// Print out the total amount
			System.out.println("Total: " + roundTo2Decimals(total));
			grandtotal += total;
		}

		System.out.println("Sum of orders: " + roundTo2Decimals(grandtotal));
	}
}