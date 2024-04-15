/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxerapp;

/**
 *
 * @author tadiw
 */
public class Boxer {
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
        String wClass = "";
        if (boxerWeight > 50 && boxerWeight < 66)
            wClass = "Light";
        else if(boxerWeight > 65 && boxerWeight < 91)
            wClass = "Middle";
        else if(boxerWeight >90)
            wClass = "Heavy";
        return wClass;
    }
}
