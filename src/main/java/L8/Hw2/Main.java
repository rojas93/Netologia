package L8.Hw2;

public class Main {
    public static void main(String[] args) {

        Account savingsAccount = new SavingsAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        savingsAccount.addMoney(900);
        savingsAccount.transfer(creditAccount,90);
        savingsAccount.transfer(checkingAccount,200);
        checkingAccount.pay(20);
    }
}
