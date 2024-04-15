
package za.ac.tut;

import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        ArrayList<String> vehicle = new ArrayList<>();
        
        for(int i = 0 ; i < vehicleInfo.length; i++){
            vehicle.add(
                    vehicleInfo[i]);
        }
        
        String[] numberPlate = registrationNumbers(vehicle);
       
        System.out.println("""
                           The list of vehicle Registration numbers
                ======================================
                           """);
        for(int i = 0 ; i < numberPlate.length ; i++){
        System.out.println(numberPlate[i]);
        }
        
       
        System.out.print("Enter the vehicle registration number of the requested  vehicle:");
        String requested = scan.nextLine();
        
        String averKm = averageKilometers(vehicle, requested);
        System.out.println(averKm);
    }
    
    public static String averageKilometers(ArrayList<String> car, String request){
     
        String averMessage;
        double distence = 0;
        
        for(int i = 0; i< car.size() ; i++){
        String[] splits = car.get(i).split("#");
        String value = splits[0];
        
        if(value.equalsIgnoreCase(request))
            distence = Double.parseDouble(splits[2]);
        
        }
        averMessage = "The average Kilometers travelled by the vehicle per year is " + distence+"km";
        return averMessage;
    }
    
    public static String[] registrationNumbers(ArrayList<String> car){
        String[] numplate = new String[car.size()];
        
        for(int i = 0; i< car.size() ; i++){
        String[] splits = car.get(i).split("#");
        numplate[i] = splits[0];
        }
        
        return numplate;
    }
    
}
