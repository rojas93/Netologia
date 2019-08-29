package L8.Hw2;

public class CheckingAccount extends Account{


    @Override
    public void pay(int amount) {
        balance = balance - amount;

        if (balance < 0){
            System.out.println("Оплата невозможна");
            balance = balance + amount;
        }
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
