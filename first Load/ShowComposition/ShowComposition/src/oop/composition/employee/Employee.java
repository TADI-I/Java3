/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.composition.employee;

import oop.composition.date.Date;

/**
 *
 * @author Student
 */
public class Employee {
    private String surname;
    private String employeeNumber;
    private Date employeementDate;

    public Employee(String surname, String employeeNumber) {
        this.surname = surname;
        this.employeeNumber = employeeNumber;
    }

    public Employee(String surname, String employeeNumber, Date employeementDate) {
        this.surname = surname;
        this.employeeNumber = employeeNumber;
        this.employeementDate = employeementDate;
    }
    
    public Employee(String surname, String employeeNumber, int year, int month, int day) {
        this.surname = surname;
        this.employeeNumber = employeeNumber;
        this.employeementDate = new Date(year, month, day);
    }

    public void setEmployeementDate(Date employeementDate) {
        this.employeementDate = employeementDate;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Date getEmployeementDate() {
        return employeementDate;
    }
    
    
    
}
