/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarraylist;

import java.util.ArrayList;
import za.ac.tut.plant.Plant;

/**
 *
 * @author tadiw
 */
public class BasicArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        ArrayList<String> colors= new ArrayList<>(); 
//        colors.add("Black");
//        colors.add("Yellow");
//        colors.add("Green");
//        colors.add("Blue");
//        
//        System.out.println(colors);
//        
//        colors.add(0,"Brown");
//        colors.remove(2);
//        System.out.println(colors);
//        
//        ArrayList<String> temp = new ArrayList<>(colors.size());
//        int index = 5;
//        for(int i = colors.size()-1; i>=0; i--){
//            
//        
//            temp.add(colors.get(i));
//                    
//        }
//        colors = temp;
//        
//    
//        System.out.println(colors);

        ArrayList<Plant> plants = new ArrayList<>();
        
        plants.add(new Plant("rose", 5));
        plants.add(new Plant("Cactus", 7));
        plants.add(new Plant("daisy", 3));
        
        for(int i = 0 ; i<plants.size(); i++){
            
        }
        
        
    }
    
}
