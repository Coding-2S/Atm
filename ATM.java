import java.util.Scanner;

public class ATM {
    private static Scanner input = new Scanner(System.in);
    private static int userId;
    private static int userPin;
    private static int accountBalance = 1000;

    public static void main(String[] args) {
        System.out.println("Enter your user ID: ");
        userId = input.nextInt();
        System.out.println("Enter your PIN: ");
        userPin = input.nextInt();

        if (userId == 123456 && userPin == 1234) {
            System.out.println("Access granted. Welcome to the ATM system.");
            showMenu();
        } else {
            System.out.println("Access denied. Incorrect user ID or PIN.");
        }
    }

    private static void showMenu() {
        int choice;
        do {
            System.out.println("\nMain Menu");
            System.out.println("1. View account balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
    }

    private static void viewBalance() {
        System.out.println("Your account balance is $" + accountBalance);
    }

    private static void withdraw() {
        System.out.println("Enter the amount you want to withdraw: ");
        int amount = input.nextInt();
        if (amount > accountBalance) {
            System.out.println("Insufficient balance. Please try again.");
        } else {
            accountBalance -= amount;
            System.out.println("$" + amount + " has been withdrawn from your account.");
        }
    }

    private static void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        int amount = input.nextInt();
        accountBalance += amount;
        System.out.println("$" + amount + " has been deposited into your account.");
    }

    private static void transfer() {
        System.out.println("Enter the amount you want to transfer: ");
        int amount = input.nextInt();
        if (amount > accountBalance) {
            System.out.println("Insufficient balance. Please try again.");
        } else {
            accountBalance -= amount;
            System.out.println("$" + amount + " has been transferred from your account.");
        }
    }
}





