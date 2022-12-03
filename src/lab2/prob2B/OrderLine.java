package lab2.prob2B;

public class OrderLine {
    private double orderLineNum;
    private double price;
    private int quantity;
    private Order owner;

    OrderLine(Order order) {
        this.owner = order;
    }

    public void setOrderLineNum(double orderLineNum) {
        this.orderLineNum = orderLineNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineNum=" + orderLineNum +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
