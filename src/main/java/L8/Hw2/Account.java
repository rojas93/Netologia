package L8.Hw2;

public abstract class Account {

    protected int balance = 0;

    public abstract void pay(int amount);
    public abstract void transfer(Account account, int amount);
    public abstract void addMoney(int amount);
}
