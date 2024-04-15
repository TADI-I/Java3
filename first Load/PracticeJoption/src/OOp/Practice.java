
package OOp;

import javax.swing.JOptionPane;

public class Practice {

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Would you like to continue");

          /*  JOptionPane.showMessageDialog(null, "are You sure"," ",JOptionPane.QUESTION_MESSAGE);
        
            JOptionPane.showMessageDialog(null, "Lets see how this looks", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "My information:\nTadii\nSongore","My information",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Notee there is no Icon" , "Plain box" , JOptionPane.PLAIN_MESSAGE);
            JOptionPane.showMessageDialog(null,"Are you maile or femaile", "Question" , JOptionPane.QUESTION_MESSAGE);
            JOptionPane.showMessageDialog(null,"you dont know your gender???", "Incorrect informatio" ,JOptionPane.WARNING_MESSAGE);
           */ 
           /* JOptionPane.showInputDialog(null,"Enter the day of the week","Monday");
            String age = JOptionPane.showInputDialog(null,"Enter Your age","18");
            int agee = Integer.parseInt(age);
            String price = JOptionPane.showInputDialog(null,"Enter item price : R","50");
            int pricee = Integer.parseInt(price);
            String letre = JOptionPane.showInputDialog(null,"Enter letter of the alphabet","b");
            char letter = letre.charAt(0);
            */
           
           String num = JOptionPane.showInputDialog(null, "enter 3 numbers seperated by a space");
           num.split(num);
           System.out.println(num);
    }
    
}
