/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.exercise2.bankAccount.BankAccount;

import inheritance.exercise2.account.Account;

/**
 *
 * @author tadiw
 */
public class BankAccount
        extends Account {

        private double balance;
    public BankAccount() {
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(double balance, int i, String string) {
        super(i,
                string);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit( double amt){
        balance += amt;
    }
    
    public void withdraw(double amt){
        balance -= amt;
    }
}
