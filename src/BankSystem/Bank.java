package BankSystem;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }

    public void openAccount(int accountNumber, String accountHolder){
        Account account = new Account(accountNumber, accountHolder);
        accounts.add(account);
        System.out.println("Account opened Successfully");
    }

    public Account findAccount(int accounNumber){
        for (Account account : accounts){
            if (account.getAccountNumber()==accounNumber){
                return account;
            }
        }
        return null;
    }
}
