public abstract class Account {
    protected double balance;
    protected String accountHolder;

    public Account(double balance, String accountHolder) {
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public abstract boolean withdraw(double amount);
}