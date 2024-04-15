/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.census;

import java.util.ArrayList;
import oop.household.Household;

/**
 *
 * @author tadiw
 */
public class Census {

   private int year;
   private ArrayList<Household> households;
     
   public Census(int year) {
            this.year = year;
            this.households = new ArrayList<>();
        }
   
    public Census(int year,
            ArrayList<Household> households) {
        this.year = year;
        this.households = households;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Household> getHouseholds() {
        return households;
    }
    
    public void conductCensus(String standNum, int occupants){
        
        Household house = new Household(standNum,
                occupants);
        this.households.add(house);
    }
    
    public int totalPopulation(){
        int occupant = 0;
        for(int i = 0 ; i < households.size();i++){
            occupant += households.get(i).getNumberOfOccupants();
        }
        
        return occupant;
    }
}
