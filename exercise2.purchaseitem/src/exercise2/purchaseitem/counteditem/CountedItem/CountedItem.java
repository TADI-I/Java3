/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2.purchaseitem.counteditem.CountedItem;

import exercise2.purchaseitem.PurchaseItem;

/**
 *
 * @author tadiw
 */
public class CountedItem
        extends PurchaseItem {
    
        private int quantity;

    public CountedItem() {
    }

    public CountedItem(int quantity) {
        this.quantity = quantity;
    }

    public CountedItem(int quantity, String string, double d) {
        super(string,
                d);
        this.quantity = quantity;
    }
        
        @Override
    public double getPrice(){
        double toReturn = super.getPrice();
        toReturn = (quantity*toReturn);
        return toReturn;
    }
      @Override
    public String toString(){
        String toReturn = super.toString();
        toReturn = toReturn +"      "+ quantity +" units     R"+getPrice();
        return toReturn;
    }
}
