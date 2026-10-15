package com.shakthii.BankAccount;

class Account {
    private final String accountNumber;
    private double balance;
    private final String owner;

    public Account(String accountNumber, String owner, double initialBalance){
        if(accountNumber == null || accountNumber.isBlank() || accountNumber.length() != 16){
            throw new IllegalArgumentException("Please provide a proper account number");
        }
        if(initialBalance <= 0) throw new IllegalArgumentException("Invalid opening balance");
        if(initialBalance >0 && initialBalance < 500) throw new IllegalArgumentException("Minimum initial deposit amount is 500.00");
        if(owner == null || owner.isBlank()) throw new IllegalArgumentException("Owner required");
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.owner = owner;
        System.out.println("Account created successfully");
    }

    public void deposit(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        if(amount < 100.00) throw new IllegalArgumentException("Minimum deposit amount is 100");
        balance += amount;
        System.out.println("Amount credited - " + amount + " for the account " + "XXXX XXXX XXXX " + accountNumber.substring(12));
    }

    public void withdraw(double amount){
        if(amount <= 0) throw new IllegalArgumentException("Invalid withdraw amount");
        if(balance - amount < 0) throw new IllegalArgumentException("Insufficient Balance");
        balance -= amount;
        System.out.println("Amount debited - " + amount + " from the account " + "XXXX XXXX XXXX " + accountNumber.substring(12) + ".Ac-balance: " + balance);

    }

    public void getBalance(){
        System.out.println("Account balance: " + balance);
    }
}

public class BankAccount {
    public static void main(String[] args){

        Account john = new Account("1234567890123456","John Wick",500.00);
        john.getBalance();
        john.withdraw(500.00);
        john.deposit(5000.00);
    }
}
