package lab4.probC;

import java.util.List;
import java.util.stream.Collectors;

public class Commissioned extends Employee {
    private double commission;
    private int baseSalary;
    private List<Order> orders;

    public Commissioned(String empId, double commission, int baseSalary, List<Order> orders) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        if (this.orders == null || this.orders.isEmpty()) return this.baseSalary;

        List<Order> orderListFromLastMonth = this.orders.stream()
                                                        .filter(anOrder -> anOrder.getOrderDate().getMonth().getValue() == month - 1
                                                                && anOrder.getOrderDate().getYear() == year)
                                                        .collect(Collectors.toList());

        double sum = 0;
        if (orderListFromLastMonth != null) {
            sum = orderListFromLastMonth.stream().map(order -> order.getOrderAmount()).mapToDouble(Double::doubleValue).sum();
        }

        return this.baseSalary + (this.commission * sum);
    }
}
