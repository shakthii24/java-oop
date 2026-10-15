package com.shakthii.BankAccount;

public class BankAccountMain {
    public static void main(String[] args){

        BankAccount john = new BankAccount("1234567890123456","John Wick",500.00);
        john.getBalance();
        john.withdraw(500.00);
        john.deposit(5000.00);
    }
}
