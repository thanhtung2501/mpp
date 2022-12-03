package lab4.probC;

public final class Paycheck {
    private double grossPay;

    public Paycheck(double grossPay){
        this.grossPay = grossPay;
    }

    public String print() {
        StringBuilder builder = new StringBuilder();
        builder.append("Paystub:").append("\n");
        builder.append("  Gross Pay: ").append(getGrossPay()).append("\n");
        builder.append(" Fica: ").append(TaxType.FICA.value).append("\n");
        builder.append(" State: ").append(TaxType.State.value).append("\n");
        builder.append(" Local: ").append(TaxType.Local.value).append("\n");
        builder.append(" Medicare: ").append(TaxType.Medicare.value).append("\n");
        builder.append(" Social Security: ").append(TaxType.SocialSecurity.value).append("\n");
        builder.append(" NET PAY: ").append(getNetPay());

        return builder.toString();
    }

    public double getNetPay() {
        double tax = grossPay * (TaxType.FICA.value + TaxType.State.value + TaxType.Local.value + TaxType.Medicare.value + TaxType.SocialSecurity.value);
        return grossPay - tax;
    }

    public double getGrossPay() {
        return grossPay;
    }
}
