/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut;

import java.util.Random;
import javax.swing.JOptionPane;
import za.ac.tut.plant.Plant;

/**
 *
 * @author tadiw
 */
public class nursery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int num = rand.nextInt(9-3)+3;
        String message = "enter the type of the plant";
        String ans = JOptionPane.showInputDialog(null, message);
        Plant flower = new Plant(ans, num);
        message = "How old is the plant?(days)?";
        ans = JOptionPane.showInputDialog(null, message);
        int old = Integer.parseInt(ans);
        flower.growth(old);
        message = "The " + flower.getPlantType() + " grew " + flower.getGrowthRate() + "cm in "+ old + " Days";
        JOptionPane.showMessageDialog(null, message);
    }
    
}
