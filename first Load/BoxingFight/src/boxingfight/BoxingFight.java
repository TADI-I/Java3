/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boxingfight;

import boxer.Boxer;

/**
 *
 * @author tadiw
 */
public class BoxingFight {
    private Boxer boxer1;
    private Boxer boxer2;
    
  
    public BoxingFight(String boxer1,
            String boxer2) {
        this.boxer1 = new Boxer();
        this.boxer2 = new Boxer();
        this.boxer1.setBoxerName(boxer1);
        this.boxer2.setBoxerName(boxer2);
    }

    public Boxer getBoxer1() {
        return boxer1;
    }

    public Boxer getBoxer2() {
        return boxer2;
    }
    
    public String possibleWinner(int fightsB1,int winsB1,int knockB1,int fightsB2,int winsB2,int knockB2){
        String possibleWinner = "";
        Boxer fight = new Boxer();
        double possibility1 = fight.winningPossibility(fightsB1,winsB1,knockB1);
        double possibility2 = fight.winningPossibility(fightsB2,winsB2,knockB2);
             
        if(possibility1>possibility2)
            possibleWinner = "The possible winner is " + getBoxer1().getBoxerName();
        else
            possibleWinner = "The possible winner is " + getBoxer2().getBoxerName();
        return possibleWinner ;
    }
    
}
