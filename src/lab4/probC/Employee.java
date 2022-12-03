package lab4.probC;

public abstract class Employee {
    protected String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public void print(int month, int year) {
        Paycheck paycheck = calcCompensation(month, year);

        StringBuilder builder = new StringBuilder();

        builder.append("Employee Id :").append(empId).append("\n");
        builder.append(paycheck.print());

        System.out.println(builder.toString());
    }

    public Paycheck calcCompensation(int month, int year) {
        double grossPay = calcGrossPay(month, year);

        Paycheck paycheck = new Paycheck(grossPay);

        return paycheck;
    }

    public abstract double calcGrossPay(int month, int year);
}
