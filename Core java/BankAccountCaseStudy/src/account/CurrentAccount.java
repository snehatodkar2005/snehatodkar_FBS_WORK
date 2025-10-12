package account;

public class CurrentAccount extends Account {
    public double overdraftLimit;

    public CurrentAccount(int accountNumber, String name, String ifscCode, double balance, double overdraftLimit) {
        super(accountNumber, name, ifscCode, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " | Remaining: ₹" + balance);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}
