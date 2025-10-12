package account;
public class LoanAccount extends Account {
    public double loanAmount;
    public double repaidAmount;

    public LoanAccount(int accountNumber, String name, String ifscCode, double loanAmount) {
        super(accountNumber, name, ifscCode, -loanAmount);
        this.loanAmount = loanAmount;
        this.repaidAmount = 0;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed for Loan accounts.");
    }

    public void repayLoan(double amount) {
        if (amount > 0) {
            repaidAmount += amount;
            balance += amount;
            System.out.println("Repaid ₹" + amount + ". Remaining Loan: ₹" + (-balance));
        } else {
            System.out.println("nvalid repayment amount!");
        }
    }

    public double getRemainingLoan() {
        return -balance;
    }
}
