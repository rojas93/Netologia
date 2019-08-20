package L7.Hw2;

public class ProgressiveTaxType extends TaxType {

    public double calculateTaxFor(double amount) {

        double resulte = 0;

        if (amount <= 100000)
            resulte = amount * 0.1;

        else if (amount > 100000)
            resulte = amount * 0.15;

        return resulte;
    }
}
