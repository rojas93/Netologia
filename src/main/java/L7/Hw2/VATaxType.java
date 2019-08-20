package L7.Hw2;

public class VATaxType extends TaxType{

    public double calculateTaxFor(double amount) {
        return amount * 0.18;
    }
}
