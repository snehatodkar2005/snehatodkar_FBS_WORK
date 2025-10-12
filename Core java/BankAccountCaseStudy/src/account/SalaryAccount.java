package account;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SalaryAccount extends SavingAccount {


	public SalaryAccount(int accountNumber, String name, String ifscCode, double balance) {
        super(accountNumber, name, ifscCode, balance);
    }

    public boolean isFrozen() {
        long months = ChronoUnit.MONTHS.between(lastTransactionDate, LocalDate.now());
        return months >= 2;
    }

    @Override
    public void withdraw(double amount) {
        if (isFrozen()) {
            System.out.println("Salary account frozen due to inactivity!");
        } else {
            super.withdraw(amount);
        }
    }
}
