/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showcomposition;

import javax.swing.JOptionPane;
import oop.composition.date.Date;
import oop.composition.employee.Employee;

/**
 *
 * @author Student
 */
public class ShowComposition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date theDate = new Date(2024, 2, 26);
        
        Employee emp = new Employee("Liebenberg" , "123456", theDate);
        
        Employee emp2 = new Employee("Langa", "456789", 2020, 10, 10);
        
        Date appointment = emp2.getEmployeementDate();
        JOptionPane.showMessageDialog(null,appointment.toString());
        
    }
    
}
