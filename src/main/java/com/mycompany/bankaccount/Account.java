/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankaccount;

/**
 *
 * @author Ibrahim.Medhat
 */
public class Account {

    private double balance;
    private final String name;

    public Account(String Name) {
        this.name = Name;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(name + " has $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println(name + " has $" + balance);
        } else {
            System.out.println("Withdrawal by" + name + "fails");
        }
    }

    public void transfer(double amount, Account acc) {
        if (this.balance < amount) {
            System.out.println("Transfer Fails");
        } else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + this.name + " becomes $" + this.balance);
            System.out.println("Account of " + acc.name + " becomes $" + acc.balance);
        }
    }
}
