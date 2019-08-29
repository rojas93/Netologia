package L8.Hw2;

public class SavingsAccount extends Account{


    @Override
    public void pay(int amount) {

        System.out.println("Оплата невозможена");
    }

    @Override
    public void transfer(Account account, int amount) {
            account.addMoney(balance);
            balance = balance - amount;
    }

    @Override
    public void addMoney(int amount) {
        balance = balance + amount;

    }
}
