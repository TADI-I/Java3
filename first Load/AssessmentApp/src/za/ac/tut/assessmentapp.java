/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut;

import javax.swing.JOptionPane;
import za.ac.tut.assessment.Assessment;

/**
 *
 * @author tadiw
 */
public class assessmentapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assessment test = new Assessment("CT1");
        String message = "Code: " +test.getCode()+"\nDifficulty:" + test.levelOfDifficulty();
        JOptionPane.showMessageDialog(null, message);
        
         Assessment test2 = new Assessment("CT2");
         message = "Code: " +test2.getCode()+"\nDifficulty:" + test2.levelOfDifficulty();
         JOptionPane.showMessageDialog(null, message);
         
         Assessment test3 = new Assessment("ST1",'C' , 45);
         message = "Code: " +test3.getCode()+"\nDifficulty:" + test3.levelOfDifficulty();
         JOptionPane.showMessageDialog(null, message);
    }
    
}
