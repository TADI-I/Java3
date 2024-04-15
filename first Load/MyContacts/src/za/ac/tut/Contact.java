/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut;

/**
 *
 * @author tadiw
 */
public class Contact {
    
    private String name; 
    private String phoneNumber;
    private char type;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(String name, String phoneNumber, char type) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public char getType() {
        return type;
    }
    
    
}
