/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import za.ac.tut.delivery.Delivery;

/**
 *
 * @author tadiw
 */
public class superfastdeliveries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] deliveryInfo = {"2019:1:12.34", "2020:1:34.44", "2020:1:35.19", "2020:2:9.47", 
								"2019:2:7.37", "2020:1:62.44", "2020:2:145.12", "2019:2:25.93", 
								"2019:1:56.83", "2020:1:81.29", "2019:2:42.33", "2019:2:22.98",
								"2020:1:35.23", "2019:1:44.44", "2019:2:108.54", "2020:2:92.11", 
								"2019:2:21.21", "2020:1:101.23", "2020:1:3.55", "2019:1:64.22", 
								"2019:2:76.36", "2020:2:64.39", "2019:1:17.04", "2020:1:7.59"};
        
        ArrayList<Delivery> deli = new ArrayList<>();
        
        for (int i = 0; i < deliveryInfo.length; i++) {
            Random rand = new Random();
            String[] splits = deliveryInfo[i].split(":");
            
            int year = Integer.parseInt(splits[0]);
            int number = rand.nextInt(9999-1) + 1;
            int code = Integer.parseInt(splits[1]);
            double weight = Double.parseDouble(splits[2]);
            
            Delivery obj = new Delivery(year,number,code,weight);
            deli.add(obj);
            
        }
        
        String light = lightest(deli);
        JOptionPane.showMessageDialog(null,
                light);
        
        
        
        
       double fee = averageFee(deli,2019 );
       
       String messege = "The Average fee for 2019 is R" + fee;
       
       JOptionPane.showInputDialog(messege);
        
    }
    
    public static double averageFee(ArrayList<Delivery> aveFee, int year) {
        double average = 0;
        int count = 0;
        
        for (int i = 0; i < aveFee.size(); i++) {
            Delivery obj = aveFee.get(i);
            if(year == obj.getYear()){
                //missing getYear() method 
                average+= obj.getFee();
                count ++;
            }
        }
        average = average / count;
        return average;
    }
    
    public static String lightest(ArrayList<Delivery> light) {
        String deliv ="The lightest weight is ";
        double low = 9999999;
                int index =0 ;
        for (int i = 0; i < light.size(); i++) {
            Delivery obj = light.get(i);
            
            if (low > obj.getWeight()) {
                low = obj.getWeight();
                index = i;
            }
        }
        deliv += light.get(index).getWeight() +"kg";
        return deliv;
    }
    
    
    
}
