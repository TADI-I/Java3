/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import inheritance.exercise2.account.Account;
import javax.swing.JOptionPane;
import oop.inheritance.exercise2.bankAccount.BankAccount.BankAccount;
import oop.inheritance.exercise2.clothingaccount.ClothingAccount.ClothingAccount;

/**
 *
 * @author tadiw
 */
public class TestAccounts {
    
    public static void main(String[] args) {
        //JOptionPane.showInputDialog("Enter account number");
        
        Account numbers = new Account(1234,"Songore");
        JOptionPane.showMessageDialog(null,
                numbers.getAccountHolder());
        BankAccount bank = new BankAccount(500,
                numbers.getAccountNumber(),
                numbers.getAccountHolder());
        
        double amt = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to with draw?"));
        bank.withdraw(amt);
        JOptionPane.showMessageDialog(null,
                bank.getBalance());
        
        ClothingAccount hemp = new ClothingAccount();
        
        double price = Double.parseDouble(JOptionPane.showInputDialog(null,
                "how much is your basket?"));
        
       JOptionPane.showMessageDialog(null,
                "Your points are is R" + hemp.getPointsEarned());
        
}
}
