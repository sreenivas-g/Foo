package com.tek.interview.question;

import java.util.ArrayList;
import java.util.List;

/* ****************************************************************************************
 
Please remove all bugs from the code below to get the following output:

<pre>

*******Order 1*******
1 book: 13.74
1 music CD: 16.49
1 chocolate bar: 0.94
Sales Tax: 2.84
Total: 28.33
*******Order 2*******
1 imported box of chocolate: 11.5
1 imported bottle of perfume: 54.62
Sales Tax: 8.62
Total: 57.5
*******Order 3*******
1 Imported bottle of perfume: 32.19
1 bottle of perfume: 20.89
1 packet of headache pills: 10.73
1 box of imported chocolates: 12.94
Sales Tax: 8.77
Total: 67.98
Sum of orders: 153.81
 
</pre>
 
******************************************************************************************** */










public class Foo {

	public static void main(String[] args) throws Exception {

		List<Order> ordersList = new ArrayList<>();
		Order c = new Order("Order 1");

		c.add(new OrderLine(new Item("book", 12.49f, false), 1));
		c.add(new OrderLine(new Item("music CD", 14.99f, false), 1));
		c.add(new OrderLine(new Item("chocolate bar", 0.85f, false), 1));

		ordersList.add(c);
		// Reuse cart for an other order
		c = new Order("Order 2");

		c.add(new OrderLine(new Item("imported box of chocolate", 10f, true), 1));
		c.add(new OrderLine(new Item("imported bottle of perfume", 47.50f, true), 1));
		ordersList.add(c);

		// Reuse cart for an other order
		c = new Order("Order 3");

		c.add(new OrderLine(new Item("Imported bottle of perfume", 27.99f, true), 1));
		c.add(new OrderLine(new Item("bottle of perfume", 18.99f, false), 1));
		c.add(new OrderLine(new Item("packet of headache pills", 9.75f, false), 1));
		c.add(new OrderLine(new Item("box of importd chocolates", 11.25f, true), 1));

		ordersList.add(c);
		new Calculator().calculate(ordersList);

	}
}
