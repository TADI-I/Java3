/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestVehicles;

import javax.swing.JOptionPane;
import oop.inheritance.exercise1.car.Car.Car;
import oop.inheritance.exercise1.truck.Truck.Truck;

/**
 *
 * @author tadiw
 */
public class TestVehicles {
    public static void main(String[] args) {
    Truck trucker = new Truck(2,
            500,
            18,
            4500);
    
        JOptionPane.showMessageDialog(null,
                trucker.toString());
    Car driver = new Car(5,
            4,
            900);
    
    JOptionPane.showMessageDialog(null,
              driver.toString());
}
}
