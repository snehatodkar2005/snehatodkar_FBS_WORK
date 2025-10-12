import bank.Bank;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        System.out.println("===== 🏦 BANK MANAGEMENT SYSTEM =====");

        while (choice != 0) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Show Transactions");
            System.out.println("7. End of Day Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                Bank.createAccount();
            } else if (choice == 2) {
                Bank.deposit();
            } else if (choice == 3) {
                Bank.withdraw();
            } else if (choice == 4) {
                Bank.checkBalance();
            } else if (choice == 5) {
                Bank.showAllAccounts();
            } else if (choice == 6) {
                Bank.showTransactions();
            } else if (choice == 7) {
                Bank.endOfDayReport();
            } else if (choice == 0) {
                System.out.println("Exiting... Thank you!");
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        sc.close();
    }
}
