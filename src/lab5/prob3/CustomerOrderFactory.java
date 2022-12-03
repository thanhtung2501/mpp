package lab5.prob3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerOrderFactory {

    private CustomerOrderFactory (){}

    public static Customer newCustomer(String name) {
        Customer customer = new Customer(name);
        List<Order> orders = new ArrayList<>();
        customer.setOrders(orders);
        return customer;
    }

    public static Order addOrderToCustomer(Customer cust, LocalDate date) {
        if(cust == null) throw new NullPointerException("Null customer");
        Order ord = new Order(date);
        cust.addOrder(ord);
        return ord;
    }
}
