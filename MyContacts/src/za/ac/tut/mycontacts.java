/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut;

import javax.swing.JOptionPane;

public class mycontacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contact bestie = new Contact("Tadii","0629622755",'p');
        Contact famMember = new Contact("Ms Songore","0615125787",'P');
        Contact lect = new Contact("Ms Booi","012 405 5566",'B');
                
        JOptionPane.showMessageDialog(null,
                bestie.getName() +"\n" + bestie.getPhoneNumber() + "\n" + bestie.getType());
        JOptionPane.showMessageDialog(null,
                famMember.getName() +"\n" + famMember.getPhoneNumber() + "\n" + famMember.getType());
        JOptionPane.showMessageDialog(null,
                lect.getName() +"\n" + lect.getPhoneNumber() + "\n" + lect.getType());
    }
    
}
