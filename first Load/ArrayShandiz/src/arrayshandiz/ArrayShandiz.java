/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayshandiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author tadiw
 */
public class ArrayShandiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> names = new ArrayList<String>();
        names.add("Tadii");
        names.add("Thandanai");
        names.add("Momo");
        names.add(0,"Simp");
        String message = "The size of the list is " +names.size();
        JOptionPane.showMessageDialog(null,
                names + message );
        names.clear();
    }
    
}
