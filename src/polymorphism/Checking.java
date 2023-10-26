public class Checking extends Account {
    public Checking(double balance, String accountHolder) {
        super(balance, accountHolder);
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}