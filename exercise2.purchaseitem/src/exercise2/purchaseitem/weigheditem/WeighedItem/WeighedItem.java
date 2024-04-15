/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2.purchaseitem.weigheditem.WeighedItem;

import exercise2.purchaseitem.PurchaseItem;

/**
 *
 * @author tadiw
 */
public class WeighedItem
        extends PurchaseItem {
    
        private double weight;

    public WeighedItem() {
    }

    public WeighedItem(double weight) {
        this.weight = weight;
    }

    public WeighedItem(double weight, String string, double d) {
        super(string,
                d);
        this.weight = weight;
    }
        
        @Override
    public double getPrice(){
        double toReturn = super.getPrice();
        toReturn = (weight*toReturn);
        return toReturn;
    }
    
        @Override
    public String toString(){
        String toReturn = super.toString();
        toReturn = toReturn +"      "+ weight +"kg   R"+getPrice();
        return toReturn;
    }
}
