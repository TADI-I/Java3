
package boxerapp;

import javax.swing.JOptionPane;
import boxerapp.Boxer;

public class BoxerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String message = "Enter 1st boxer name";
        String name = JOptionPane.showInputDialog(null,message);
        message = "Enter 1st Boxer weight";
        String weight = JOptionPane.showInputDialog(null,message);
        double bWeight = Double.parseDouble(weight);
        
        Boxer boxer1 = new Boxer();
        boxer1.setBoxerName(name);
        boxer1.setBoxerWeight(bWeight);
       
        message = "Enter 2nd boxer name";
        name = JOptionPane.showInputDialog(null,message);
        message = "Enter 2nd Boxer weight";
        weight = JOptionPane.showInputDialog(null,message);
        bWeight = Double.parseDouble(weight);
        Boxer boxer2 = new Boxer(name,bWeight);
        
        message = "Enter 3rd boxer name";
        name = JOptionPane.showInputDialog(null,message);
        message = "Enter 3rd Boxer weight";
        weight = JOptionPane.showInputDialog(null,message);
        bWeight = Double.parseDouble(weight);
        Boxer boxer3 = new Boxer(name,bWeight);
        
        String message1= "Boxer 1\nName: " +boxer1.getBoxerName() + "\nWeight Class :" + boxer1.determineWeightCategory();
        String message2= "\nBoxer 2\nName: " +boxer2.getBoxerName() + "\nWeight Class :" + boxer2.determineWeightCategory();
        String message3= "\nBoxer 3\nName: " +boxer3.getBoxerName() + "\nWeight Class :" + boxer3.determineWeightCategory();
        message = message1 + message2 + message3;
        
        JOptionPane.showMessageDialog(null,
                message);
    }
    
}
