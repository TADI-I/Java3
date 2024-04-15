/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import za.ac.tut.vehicle.Vehicle;

/**
 *
 * @author tadiw
 */
public class secondhanddealership {

    /**
     * @param args the command line arguments
     */
    private int CURRENT_YEAR;
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] vehicleInfo = {"FG34QWGP#2015#17367.6#true",
								"SP45DHGP#2013#83431.8#true",
								"SDT291NC#2008#134984.3#false",
								"SPR917FS#2011#99346.3#false",
								"JW18XPGP#2012#104368.1#true",
								"CCP667NW#2013#78364.9#true",
								"AR22DDGP#2014#66714.5#true",
								"POD524NC#2013#49366.6#false",
								"LJ76EGGP#2013#104258.8#true"};
        
       ArrayList<Vehicle> car = new ArrayList<>();
       
        for (int i = 0; i < vehicleInfo.length; i++) {
            
            String[] splits = vehicleInfo[i].split("#");
            String reg = splits[0];
            int year = Integer.parseInt(splits[1]);
            double distence = Double.parseDouble(splits[2]);
            boolean service = Boolean.parseBoolean(splits[3]);
            
            Vehicle vroom = new Vehicle(reg,year,distence,service);
            car.add(vroom);
        }
       
        String[] plates = registrationNumbers(car);
        String messege = """
                         The List of Vehicle registrations
                         =========================""";
        for (int i = 0; i < plates.length; i++) {
            messege += "\n" + plates[i];
        }
        
        JOptionPane.showMessageDialog(null,
                messege);
        
        messege ="Enter the vehicle registration number of the requested  vehicle:";
        String request = JOptionPane.showInputDialog(messege);
        
        String dis = averageKilometers(car, request);
        
        JOptionPane.showMessageDialog(null,
                dis);
    }
    
    public static String averageKilometers(ArrayList<Vehicle> car , String req){
        String dis = "The average Kilometers travelled by the vehicle per year is ";
        
        for (int i = 0; i < car.size(); i++) {
            
            Vehicle obj = car.get(i);
            
            if (req.equalsIgnoreCase(obj.getRegNumber())) {
                
                dis += obj.getKilometers();
                
            }
        }
        
        return dis;
    }
    public static String[] registrationNumbers(ArrayList<Vehicle> car){
        String[] plates = new String[car.size()];
        
        for (int i = 0; i < plates.length; i++) {
           Vehicle obj = car.get(i); 
           plates[i] = obj.getRegNumber();
        }
        return plates;
    }
    
}
