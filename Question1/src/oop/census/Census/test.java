/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.census.Census;

import java.util.ArrayList;

/**
 *
 * @author tadiw
 */
public class test {
    
    public static void main(String[] args) {
    // Create a Census for the current year
    Census census = new Census(2024, new ArrayList<>());

    // Conduct census on a few households
    census.conductCensus("Stand1", 4);
    census.conductCensus("Stand2", 3);
    census.conductCensus("Stand3", 5);

    // Print out the total population
    System.out.println("Total population: " + census.totalpopulation());
}

}
