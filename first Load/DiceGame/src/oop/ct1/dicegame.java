/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.ct1;

import javax.swing.JOptionPane;
import oop.ct1.dice.Dice;

/**
 *
 * @author tadiw
 */
public class dicegame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message ;
        String ans;
        int num = 0;
        
        Dice rolled = new Dice();
        String range = "";
        rolled.roll();
        do{
            message = "Guess number between 1 - 6";
            ans = JOptionPane.showInputDialog(null,message);
            num = Integer.parseInt(ans);
        if (num > rolled.getValue())
            range = "Greater than " + rolled.getValue();
        else if (num < rolled.getValue())
            range = "less than " + rolled.getValue();
        else if (num == rolled.getValue())
        {
            range = "equal to " + rolled.getValue() +"\n congratulations";
           
        }
         message = "number Guessed is " + range;
        JOptionPane.showMessageDialog(null, message);
        }while (num != rolled.getValue());
            
        
        
    }
    
}
