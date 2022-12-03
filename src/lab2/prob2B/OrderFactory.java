package lab2.prob2B;

import java.time.LocalDate;

public class OrderFactory {
    public static Order createOrder(double orderNum, LocalDate orderDate, double orderLineNum, double price, int quantity) {
        Order order = new Order(orderNum, orderDate);

        order.addOrderLine(orderLineNum, price, quantity);

        return order;
    }

}
