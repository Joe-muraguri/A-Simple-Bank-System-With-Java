package BankSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Welcome to Joe's Sacco Bank\n");
            System.out.println("\n1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Account Number\n");
                    int accountNumber = scanner.nextInt();

                    System.out.println("Enter Account Holder's Name");
                    String accountHolder = scanner.nextLine();
                    bank.openAccount(accountNumber, accountHolder);
                    break;

                case 2:
                    System.out.println("Enter Account Number");
                    accountNumber = scanner.nextInt();
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    Account depositAccount = bank.findAccount(accountNumber);
                    if (depositAccount != null){
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 3:
                    System.out.println("Enter Account Number");
                    accountNumber = scanner.nextInt();
                    System.out.println("Enter Amount to withdraw");
                    double withdrawAmount = scanner.nextInt();
                    Account withdrawAccount = bank.findAccount(accountNumber);
                    if (withdrawAccount != null){
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 4:
                    System.out.println("Enter Account Number");
                    accountNumber = scanner.nextInt();
                    Account checkAccount = bank.findAccount(accountNumber);
                    if (checkAccount != null){
                        System.out.println("Account Holder: " + checkAccount.getAccountHolder());
                        System.out.println("Account Balance: Ksh " + checkAccount.getBalance());
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 5:
                    System.out.println("Thanks for using Our Banking Services");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid operation. Please try again");

            }
        }
    }
}
