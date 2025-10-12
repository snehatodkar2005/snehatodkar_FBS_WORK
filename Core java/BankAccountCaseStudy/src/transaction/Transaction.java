package transaction;

import java.time.LocalDateTime;

public class Transaction {
    public int accountNumber;
    public String type;
    public double amount;
    public LocalDateTime dateTime;

    public Transaction(int accountNumber, String type, double amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public void displayTransaction() {
        System.out.println(dateTime + " | " + type + " | ₹" + amount + " | Account: " + accountNumber);
    }
}
