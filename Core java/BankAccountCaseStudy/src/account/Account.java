package account;

import java.time.LocalDate;

public abstract class Account {
    public int accountNumber;
    public String name;
    public String ifscCode;
    public double balance;
    public LocalDate lastTransactionDate;

    public Account(int accountNumber, String name, String ifscCode, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.ifscCode = ifscCode;
        this.balance = balance;
        this.lastTransactionDate = LocalDate.now();
    }

    // Getter and Setter
    public int getAccountNumber() { 
    	return accountNumber; 
    	}
    public void setAccountNumber(int accountNumber) { 
    	this.accountNumber = accountNumber; 
    	}
    public String getName() { 
    	return name; 
    	}
    public void setName(String name) { 
    	this.name = name; 
    	}
    public String getIfscCode() { 
    	return ifscCode;
    	}
    public void setIfscCode(String ifscCode) { 
    	this.ifscCode = ifscCode; 
    	}
    public double getBalance() { 
    	return balance; 
    	}
    public void setBalance(double balance) { 
    	this.balance = balance; 
    	}
    public LocalDate getLastTransactionDate() { 
    	return lastTransactionDate;
    	}
    public void setLastTransactionDate(LocalDate lastTransactionDate) { 
    	this.lastTransactionDate = lastTransactionDate; 
    	}

    // Common behaviors
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastTransactionDate = LocalDate.now();
            System.out.println("✅ Deposited ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    public abstract void withdraw(double amount);

    public void checkBalance() {
        System.out.println("💰 Account No: " + accountNumber + " | Balance: ₹" + balance);
    }

    public void displayInfo() {
        System.out.println(accountNumber + " | " + name + " | IFSC: " + ifscCode + " | ₹" + balance);
    }
}
