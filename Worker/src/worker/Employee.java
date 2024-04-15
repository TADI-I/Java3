/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worker;

public class Employee
        extends Worker {
    
        private long employeeId;
        private String hireDate;
        
        public Employee(){
            
        }

    public Employee(long employeeId, String hireDate, String birthDate, String endDate) {
        super(birthDate,
                endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
        
        
        
        
       
        
}
