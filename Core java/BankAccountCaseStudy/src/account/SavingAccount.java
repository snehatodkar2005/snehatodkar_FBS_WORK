package account;

public class SavingAccount extends Account {
    public static double MIN_BALANCE = 10000;

    public SavingAccount(int accountNumber, String name, String ifscCode, double balance) {
        super(accountNumber, name, ifscCode, balance);
    }

    static double getMinBalance() {
		return MIN_BALANCE;
	}

	static void setMinBalance(double minBalance) {
		MIN_BALANCE = minBalance;
	}

	@Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println(" Withdrawn ₹" + amount + " | Remaining: ₹" + balance);
        } else {
            System.out.println(" Maintain minimum balance ₹" + MIN_BALANCE);
        }
    }
}
