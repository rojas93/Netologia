package L8.Hw2;

public class CreditAccount extends Account {


    @Override
    public void pay(int amount) {
        balance = balance - amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        System.out.println("Перевод невозможен с кредитного счета");
    }

    @Override
    public void addMoney(int amount) {
        balance = balance + amount;

        if(balance > 0){
            System.out.println("Кредитный счет не может быть положительным");

            balance = balance - amount;
        }


    }
}
