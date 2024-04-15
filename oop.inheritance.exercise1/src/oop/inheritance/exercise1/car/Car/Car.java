/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.exercise1.car.Car;

import oop.inheritance.exercise1.vehicle.Vehicle.Vehicle;

/**
 *
 * @author tadiw
 */
public class Car
        extends Vehicle {

        private int passengerLoad;
        
    public Car() {
    }

    public Car(int passengerLoad, int wheels, double weight) {
        super(wheels,
                weight);
        this.passengerLoad = passengerLoad;
    }

    public int getPassengerLoad() {
        return passengerLoad;
    }
    
//    public String info(){
//        return "This car can carry " + passengerLoad +" People\nIt has " + getWheels() + " wheels\nIt weighs "+ getWeight()+
//                "kg";
//    }
    
        @Override
    public String toString(){
        String toReturn = super.toString();
        toReturn = toReturn + "\nNumber of passenger = " + passengerLoad;
        return toReturn;
    }

}
