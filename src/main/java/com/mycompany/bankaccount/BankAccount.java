/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bankaccount;

/**
 *
 * @author Ibrahim.Medhat
 */
public class BankAccount {

    public static void main(String[] args) {
        Account tom = new Account("tom");
        tom.deposit(500.0);
        tom.deposit(189.5);
        tom.getBalance();
        Account sandy = new Account("sandy");
        sandy.deposit(400.0);
        sandy.withdraw(50.0);
        sandy.getBalance();

        tom.transfer(100.0, sandy);

    }
}
