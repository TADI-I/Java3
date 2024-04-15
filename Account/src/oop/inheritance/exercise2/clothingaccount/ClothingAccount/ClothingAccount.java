
package oop.inheritance.exercise2.clothingaccount.ClothingAccount;

import inheritance.exercise2.account.Account;

/**
 *
 * @author tadiw
 */
public class ClothingAccount
        extends Account {
    private int pointsEarned;
    private double credit = 200;
    private double creditLimit = 500;

    public ClothingAccount() {
    }

    public ClothingAccount(int pointsEarned, double credit, double creditLimit) {
        this.pointsEarned = pointsEarned;
        this.credit = credit;
        this.creditLimit = creditLimit;
    }

    public ClothingAccount(int pointsEarned, double credit, double creditLimit, int i, String string) {
        super(i,
                string);
        this.pointsEarned = pointsEarned;
        this.credit = credit;
        this.creditLimit = creditLimit;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public double getCredit() {
        return credit;
    }
    
    public boolean buy(double price){
        if(credit > creditLimit)
            return false;
        else
        {
            credit+= price;
            pointsEarned += (price/100);
            return true;
        }
        
    }
    
    public double minimumPayment(){
        return (credit*1.15);
    }
}
