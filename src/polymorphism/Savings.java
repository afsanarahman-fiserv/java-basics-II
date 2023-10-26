public class Savings extends Account {
    private static final int maxMonthlyWithdrawals = 5;
    private int withdrawalsSoFar;

    public Savings(double balance, String accountHolder) {
        super(balance, accountHolder);
        withdrawalsSoFar = 0;
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance > amount && withdrawalsSoFar < maxMonthlyWithdrawals) {
            balance -= amount;
            return true;
        }
        return false;
    }
}