/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.inheritance.exercise1.truck.Truck;

import oop.inheritance.exercise1.vehicle.Vehicle.Vehicle;

/**
 *
 * @author tadiw
 */
public class Truck
        extends Vehicle {
    
        public int passengerLoad;
        public double payload;

    public Truck() {
    }

    public Truck(int passengerLoad, double payload) {
        this.passengerLoad = passengerLoad;
        this.payload = payload;
    }

    public Truck(int passengerLoad, double payload, int wheels, double weight) {
        super(wheels,
                weight);
        this.passengerLoad = passengerLoad;
        this.payload = payload;
    }

    public int getPassengerLoad() {
        return passengerLoad;
    }

    public double getPayload() {
        return payload;
    }
        
//  public String info() {
//    return "The truck with " + getWheels() + " wheels can carry " + passengerLoad + " passangers\nCan carry " + payload
//            + "kg\nThe total weight of the truck and load would be " + (payload + getWeight()) + "kg";
//}
    
        @Override
    public String toString(){
        String toReturn = super.toString();
        toReturn = toReturn +"\nNumber of passangers = "+ passengerLoad + "\nPayLoad of the truck = " + payload +"kg";
        return toReturn;
    }
}
