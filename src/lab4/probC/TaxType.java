package lab4.probC;

public enum TaxType {
    FICA(0.23),
    State(0.05),
    Local(0.01),
    Medicare(0.03),
    SocialSecurity(0.075);

    public final double value;

    TaxType(double value) {
        this.value = value;
    }
}
