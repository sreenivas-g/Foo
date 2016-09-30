package com.tek.interview.question.test;

import org.junit.Test;

import com.tek.interview.question.Calculator;
import com.tek.interview.question.Item;
import com.tek.interview.question.Order;
import com.tek.interview.question.OrderLine;

import static org.junit.Assert.*;

public class FooTest {
	/*
	 * Test to check whether orderLines is properly initialized on construction.
	 */
	@Test
	public void testOrderConstruction() {
		Order order = new Order("Test Order");
		assertEquals(0, order.size());
	}
	
	/*
	 * Order object should preserve the insertion order for order items.
	 */
	@Test
	public void testAddOrder() {
		Order order = new Order("Test Order");
		try {
			order.add(null);
		} catch (Exception e) {
			assertEquals(true, e instanceof IllegalArgumentException);
		}
		assertEquals(0, order.size());
	}
	
	/*
	 * Order object should preserve the insertion order for order items.
	 */
	@Test
	public void testOrderLineItemsInsertionOrder() {
		Order order = new Order("Test Order");
		OrderLine orderLine1 = new OrderLine(new Item("test item 1", 1.0f, true), 2);
		OrderLine orderLine2 = new OrderLine(new Item("test item 2", 1.0f, true), 2);
		order.add(orderLine1);
		order.add(orderLine2);
		assertEquals(orderLine1, order.get(0));
		assertEquals(orderLine2, order.get(1));
	}

	/*
	 * Order object should preserve the insertion order for order items.
	 */
	@Test
	public void testRoundTo2Decimal() {
		double actualVal = Calculator.roundTo2Decimals(12.2343243d);
		assertEquals(12.23d, actualVal,0.0d);
	}
	
	//We can write test cases for calculate method as well, in which case we need to start capturing computed values instead of just printing it to System.out
	
}
