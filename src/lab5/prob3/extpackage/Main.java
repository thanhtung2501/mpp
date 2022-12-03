package lab5.prob3.extpackage;

import lab5.prob3.Customer;
import lab5.prob3.CustomerOrderFactory;
import lab5.prob3.Order;

import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
//		Customer cust = new Customer("Bob");
//		Order order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Shirt");
//		order.addItem("Laptop");
//
//		order = Order.newOrder(cust, LocalDate.now());
//		order.addItem("Pants");
//		order.addItem("Knife set");

//		System.out.println(cust.getOrders());

		Customer cust = CustomerOrderFactory.newCustomer("Bob");
		Order order1 = CustomerOrderFactory.addOrderToCustomer(cust, LocalDate.now());
		order1.addItem("Shirt");
		order1.addItem("Laptop");

		Order order2 = CustomerOrderFactory.addOrderToCustomer(cust, LocalDate.now().minusDays(1));
		order2.addItem("Pants");
		order2.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
