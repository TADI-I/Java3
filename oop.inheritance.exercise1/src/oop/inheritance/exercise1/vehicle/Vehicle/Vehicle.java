/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.inheritance.exercise1.vehicle.Vehicle;

/**
 *
 * @author tadiw
 */
public class Vehicle {

    private int wheels;
    private double weight;

    public Vehicle() {
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public double getWeight() {
        return weight;
    }
    
   public String toString(){
       return "Number of wheels = "+wheels+
               "\nWeight of the vehicle = "+ weight+"kg";
       
   }
}
