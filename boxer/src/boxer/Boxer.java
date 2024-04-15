/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boxer;

/**
 *
 * @author tadiw
 */
public class Boxer {

    /**
     * @param args the command line arguments
     */
   private String boxerName;
   private double boxerWeight;

    public Boxer() {
    }

    public Boxer(String boxerName,
            double boxerWeight) {
        this.boxerName = boxerName;
        this.boxerWeight = boxerWeight;
    }

    public void setBoxerName(String boxerName) {
        this.boxerName = boxerName;
    }

    public void setBoxerWeight(double boxerWeight) {
        this.boxerWeight = boxerWeight;
    }

    public String getBoxerName() {
        return boxerName;
    }

    public double getBoxerWeight() {
        return boxerWeight;
    }
   
    public String determineWeightCategory(){
        if(getBoxerWeight()>= 50 && getBoxerWeight() <= 65)
            return "Light";
        else if (getBoxerWeight()>65 && getBoxerWeight()<91)
            return "Middle";
        else if(getBoxerWeight() > 90)
            return "Heavy";
        
        return null;
    }
    
}
