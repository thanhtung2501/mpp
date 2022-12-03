package lab2;

import lab2.prob2A.Student;
import lab2.prob2B.Order;
import lab2.prob2B.OrderFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // problem 2A
        Student student1 = new Student("Thanh Tung Le");
        Student student2 = new Student("Dang Tu Nguyen");
        Student student3 = new Student("Thanh Dung Nguyen");

        student1.getGradeReport().setGrade("A+");
        student2.getGradeReport().setGrade("A+");
        student3.getGradeReport().setGrade("A+");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // problem 2B
        Order order = OrderFactory.createOrder(101, LocalDate.now(), 201, 1000, 5);

        order.addOrderLine(202, 1000, 10);
        order.addOrderLine(203, 2000, 20);
        System.out.println(order);
    }
}