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
public class Exercise1 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null,"Enter length");
        double length = Double.parseDouble(num);
        num = JOptionPane.showInputDialog(null,"Enter width");
        double width = Double.parseDouble(num);
        num = JOptionPane.showInputDialog(null,"Enter Average Depth");
        double depth = Double.parseDouble(num);
        
        String ans = JOptionPane.showInputDialog(null, "What do you want to calculate?\n1.Perimiter\n2.Volume\n3.Underground Surface area\n0.Exit\n Enter number");
        int option = Integer.parseInt(ans);
        while (option>0) {            
            
        switch (option) {
            case 0:
                System.exit(0);
            case 1:
                JOptionPane.showMessageDialog(null, perimeter(length,width));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, volume(length,width,depth));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, surfaceA(length,width,depth));
                 break;
            default:
               JOptionPane.showMessageDialog(null, "Invalid Option","Error",JOptionPane.ERROR_MESSAGE);
        }
         ans = JOptionPane.showInputDialog(null, "What do you want to calculate?\n1.Perimiter\n2.Volume\n3.Underground Surface area\n0.Exit\n Enter number");
             option = Integer.parseInt(ans);
        } 
        
    }
    
    public static double perimeter(double length, double width){
        double perimeterr = length * width;
        
        return perimeterr;
    }
     public static double volume(double length, double width , double depth){
        double vol = length * width*depth;
        
        return vol;
    }
      public static double surfaceA(double length, double width , double depth){
        double surfA = 2*(length + width)*depth + length *width;
        
        return surfA;
    }
 }

