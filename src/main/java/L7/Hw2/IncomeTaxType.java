package L7.Hw2;

public class IncomeTaxType extends TaxType {

    public double calculateTaxFor(double amount) {
        return amount * 0.13;
    }
}
