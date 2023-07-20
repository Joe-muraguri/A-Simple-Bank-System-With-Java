package BankSystem;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: Ksh " + amount);
    }

    public void withdraw(double amount){
        if (balance>=amount){
            System.out.println("Withdrawn: Ksh" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}
