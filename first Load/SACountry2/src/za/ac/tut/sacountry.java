
package za.ac.tut;

import java.util.ArrayList;
import javax.swing.JOptionPane; 
import za.ac.tut.city.City;

/**
 *
 * @author tadiw
 */
public class sacountry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] citiesInfo = {"Kimberley#Northern Cape#175860", "Chatsworth#KwaZulu-Natal#192166", 
					"Katlehong#Gauteng#349866", "Port Elizabeth#Eastern Cape#237500", 
					"Khayelitsha#Western Cape#329002", "Pretoria#Gauteng#525387", 
					"Bloemfontein#Free State#217076", "Tshivhase#Limpopo#226622", 
					"Soweto#Gauteng#858644", "Pietermaritzburg#KwaZulu-Natal#223519",
					"Burban#KwaZulu-Natal#536644", "Nelspruit#Mpumalanga#359600", 
					"Johannesburg#Gauteng#1009035", "Mamelodi#Gauteng#256117"};
        
        ArrayList<City> city = new ArrayList<>();
        
        for(int i = 0 ; i< citiesInfo.length; i++){
           
            String[] splits = citiesInfo[i].split("#");
            
            String cit = splits[0];
            String province = splits[1];
            int popu = Integer.parseInt(splits[2]);
            
            City obj = new City(cit);
            obj.setPopulation(popu);
            obj.setProvince(province);
            
            city.add(obj);
        }
        String message = highestPopulation(city);
        JOptionPane.showMessageDialog(null,
                message);
        
        
       
        
        int numberOfC = citiesPerProvince(city, "Gauteng");
        message = "The number of cities on Gauteng is " + numberOfC;
        JOptionPane.showMessageDialog(null,
                message);
        
        updatePopulation(city, 2.36);
        
        
    }
    
    
    public static void updatePopulation(ArrayList<City> city ,  double perc){
        double newPop;
        
        for (int i = 0; i < city.size(); i++) {
            City obj = city.get(i);
            newPop = (obj.getPopulation() * 0.236) + obj.getPopulation();
            
            obj.setPopulation((int) newPop);
        }
    }
    
    public static int citiesPerProvince(ArrayList<City> city , String province){
        
        int numOfC = 0;
        
        for(int i = 0; i < city.size() ; i++){
            City obj = city.get(i);
            
            if (obj.getProvince().equalsIgnoreCase(province)) {
                numOfC ++;
                
            }
        }
        return numOfC;
    }
    
    public static String highestPopulation(ArrayList<City> cityy){
        String highest = " The City with the highest population is ";
        int high = 0;
        int index = 0;
        for(int i = 0 ; i< cityy.size() ; i++){
            City obj = cityy.get(i);
            
            if(obj.getPopulation() > high){
               high = obj.getPopulation();
                index = i;
            }
            
            
        }
        highest += cityy.get(index).getName();
       
        return highest;
    }
    
}
