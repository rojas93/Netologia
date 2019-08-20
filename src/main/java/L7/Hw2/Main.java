package L7.Hw2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        List<Bill> payments = Arrays.asList(
                new Bill(1000, new VATaxType(), taxService),
                new Bill(15000, new ProgressiveTaxType(), taxService),
                new Bill(35000, new IncomeTaxType(), taxService)

        );
        for (int i = 0; i < payments.size(); ++i) {
            Bill bill = payments.get(i);
            bill.payTaxes();
        }
    }
}
