/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxingfight;

import javax.swing.JOptionPane;
import boxingfight.BoxingFight;
/**
 *
 * @author tadiw
 */
public class Fight {
    public static void main(String[] args) {
        
        String message = "Enter 1st boxer name";
        String boxer1 = JOptionPane.showInputDialog(null,message);
        
        message = "Enter 2nd boxer name";
        String boxer2 = JOptionPane.showInputDialog(null,message);
        
        
        BoxingFight fight1 = new BoxingFight( boxer1,boxer2);
        
        
        message = "How many fights has "+ fight1.getBoxer1().getBoxerName()+" had?";
        boxer1 = JOptionPane.showInputDialog(null,message);
        int ansB1  = Integer.parseInt(boxer1);
        
        message = "How many fights has "+ fight1.getBoxer2().getBoxerName()+" had?";
        boxer2 = JOptionPane.showInputDialog(null,message);
        int ansB2  = Integer.parseInt(boxer2);
        
        message = "How many Wins has "+ fight1.getBoxer1().getBoxerName()+" had?";
        boxer1 = JOptionPane.showInputDialog(null,message);
        int ans2B1  = Integer.parseInt(boxer1);
        
        message = "How many Wins has "+ fight1.getBoxer2().getBoxerName()+" had?";
        boxer2 = JOptionPane.showInputDialog(null,message);
        int ans2B2  = Integer.parseInt(boxer2);
        
        message = "How many Knock outs has "+ fight1.getBoxer1().getBoxerName()+" had?";
        boxer1 = JOptionPane.showInputDialog(null,message);
        int ans3B1  = Integer.parseInt(boxer1);
       
        message = "How many Knock outs has "+ fight1.getBoxer2().getBoxerName()+" had?";
        boxer2 = JOptionPane.showInputDialog(null,message);
        int ans3B2  = Integer.parseInt(boxer2);
        
        message = fight1.possibleWinner(ansB1,ans2B1,ans3B1,ansB2,ans2B2, ans3B2);
        JOptionPane.showMessageDialog(null,
                message);
    }
}
