/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankupgraded;

/**
 *
 * @author tadiw
 */
public class BankUpgraded {

/**
 * @param args the command line arguments
 */
    private double Balance = 2000;
    private double deposit ,withdraw;
    private int accNum;

    public BankUpgraded() {
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }
   

    public double getBalance() {
        return Balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }
    
    public String withdrawing(double withdarw){
        
        if(withdarw > Balance)
         return "insufficient funds\nAvailable Balance is R:"+ Balance;
        else{
            Balance -= withdarw;
            return "Withdraw Successfull\nAvailable Balance is R" + Balance;
        }
    }
   
    public String Depositing(double deposit){
        
        if(deposit < 50)
         return "Minimum Deposit Amount is R50";
        else{
            Balance += deposit;
            return "Deposit Successfull\nAvailable Balance is R" + Balance;
        }
    }
    
    

}
