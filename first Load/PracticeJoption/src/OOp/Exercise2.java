/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOp;

import javax.swing.JOptionPane;

/**
 *
 * @author tadiw
 */
public class Exercise2 {
    public static void main(String[] args) {
        final double profAdult = 45.5;
        final double profChild = 28;
        final double adult = 15.75;
        final double child = 12.50;
        double price, profit;
        
        
        String name = JOptionPane.showInputDialog(null, "Enter name");
        
        String ans = JOptionPane.showInputDialog(null,"Enter number of Adult meals?");
        int big = Integer.parseInt(ans);
        price = big * profAdult;
        profit = big * adult;
        
        ans = JOptionPane.showInputDialog(null,"Enter number of child meals?");
        int small = Integer.parseInt(ans);
        price += small* profChild;
        profit += small * child;
        
        ans = JOptionPane.showInputDialog(null,"Amount due R "+ price +"\nEnter number enter amount paid");
        double paid = Double.parseDouble(ans);
        
        double change = paid - price;
        double totalProfit = price- profit;
        JOptionPane.showMessageDialog(null,"Customer "+ name+" Your change is R" +change +"\n Profit made R" + totalProfit);
    }
    
}
