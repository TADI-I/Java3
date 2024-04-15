/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicarraylist2;

import java.util.ArrayList;

/**
 *
 * @author tadiw
 */
public class BasicArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("0629622755");
        numbers.add("0629622755");
        numbers.add("0833457532");
        numbers.add("0629622755");
        numbers.add("0839568334");
        
        System.out.println(numbers);
        numbers.set(2,"0956425245");
        numbers.remove(numbers.size());
        
    }
    
}
