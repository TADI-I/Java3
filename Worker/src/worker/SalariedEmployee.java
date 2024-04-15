/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package worker;


public class SalariedEmployee
        extends Employee {
    private double annualSalary;
    private boolean  isRetired;
    
    public SalariedEmployee(){
        
    }

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(double annualSalary, boolean isRetired, long employeeId, String hireDate, String birthDate, String endDate) {
        super(employeeId,
                hireDate,
                birthDate,
                endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

 
    
}
