package vn.funix.fx19878.java.asm2.models;

import java.text.DecimalFormat;

public class Account {
    private String accountNumber;
    private double balance;


    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isPremium() {
        return getBalance() >= 10000000;
    }

    public String toString() {
        DecimalFormat format = new DecimalFormat("#,###đ");
        return accountNumber + " |                       " + format.format(balance);
    }
}
