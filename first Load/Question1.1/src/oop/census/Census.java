
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
    }

    public Census(int year, ArrayList<Household> households) {
        this.year = year;
        this.households = households;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<Household> getHouseholds() {
        return households;
    }

    public void conductCensus(String standNum, int occupants) {
    
        Household house = new Household(standNum, occupants);
        
    }

    public int totalPopulation(){
        int pop = 0;
        return pop;
    }
    
}
