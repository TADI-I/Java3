
package oop.census.Census;

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
    
    public void conductCensus(String stand , int occupants){
       
        Household obj = new Household(stand,occupants);
        households.add(obj);
        
    }
    
    public int totalpopulation(){
        int totalRes = 0;
        for(int i = 0 ; i< households.size() ; i++){
            totalRes += households.get(i).getNumberOfOccupants();
        }
        
        return totalRes;
    }

}
