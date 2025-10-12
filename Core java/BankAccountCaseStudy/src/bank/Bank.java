package bank;

import account.*;
import transaction.Transaction;
import java.util.*;

public class Bank {
    public static List<Account> accounts = new ArrayList<>();
    public static List<Transaction> transactions = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void createAccount() {
        System.out.println("\nAccount Type: 1.Saving  2.Salary  3.Current  4.Loan");
        int type = sc.nextInt();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter IFSC Code: ");
        String ifsc = sc.next();
        System.out.print("Enter Opening Balance / Loan Amount: ");
        double bal = sc.nextDouble();

        Account acc = null;

        if (type == 1) {
            acc = new SavingAccount(accNo, name, ifsc, bal);
        } else if (type == 2) {
            acc = new SalaryAccount(accNo, name, ifsc, bal);
        } else if (type == 3) {
            System.out.print("Enter Overdraft Limit: ");
            double limit = sc.nextDouble();
            acc = new CurrentAccount(accNo, name, ifsc, bal, limit);
        } else if (type == 4) {
            acc = new LoanAccount(accNo, name, ifsc, bal);
        } else {
            System.out.println("Invalid Account Type!");
        }

        if (acc != null) {
            accounts.add(acc);
            System.out.println("Account Created Successfully!");
        }
    }

    public static Account findAccount(int accNo) {
        for (Account acc : accounts)
            if (acc.accountNumber == accNo) return acc;
        return null;
    }

    public static void deposit() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);

        if (acc != null) {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
            transactions.add(new Transaction(accNo, "Deposit", amt));
        } else {
            System.out.println("Account Not Found!");
        }
    }

    public static void withdraw() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);

        if (acc != null) {
            System.out.print("Enter Amount: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
            transactions.add(new Transaction(accNo, "Withdraw", amt));
        } else {
            System.out.println("❌ Account Not Found!");
        }
    }

    public static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        Account acc = findAccount(accNo);
        if (acc != null) acc.checkBalance();
        else System.out.println("❌ Account Not Found!");
    }

    public static void showAllAccounts() {
        System.out.println("\n------ All Accounts ------");
        for (Account acc : accounts) acc.displayInfo();
    }

    public static void showTransactions() {
        System.out.println("\n------ Transactions ------");
        for (Transaction t : transactions) t.displayTransaction();
    }

    public static void endOfDayReport() {
        System.out.println("\n📅 End of Day Report");
        System.out.println("Total Accounts: " + accounts.size());
        for (Account acc : accounts) acc.displayInfo();
    }
}

