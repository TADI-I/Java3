/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxer;

import javax.swing.JOptionPane;

/**
 *
 * @author tadiw
 */
public class BoxerApp {
    public static void main(String[] args) {
        
        String message = "Enter Boxer Name";
        String name = JOptionPane.showInputDialog(message);
        message = "Enter boxer weight";
        double weight = Double.parseDouble(JOptionPane.showInputDialog(message));
        
        Boxer boxer = new Boxer(name,
                weight);
        
        message = "The weight class for " + boxer.getBoxerName() + " Is " +boxer.determineWeightCategory();
        JOptionPane.showMessageDialog(null,
                message);
    }
}
