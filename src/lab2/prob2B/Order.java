package lab2.prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private double orderNum;
    private LocalDate orderDate;
    private List<OrderLine> orderLines;

    Order(double orderNum, LocalDate orderDate){
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderLines = new ArrayList<>();
    }

    public void addOrderLine(double orderLineNum, double price, int quantity) {
        OrderLine orderLine = new OrderLine(this);

        orderLine.setOrderLineNum(orderLineNum);
        orderLine.setPrice(price);
        orderLine.setQuantity(quantity);

        this.orderLines.add(orderLine);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", orderDate=" + orderDate +
                ", orderLines=" + orderLines +
                '}';
    }
}
