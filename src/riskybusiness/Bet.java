/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskybusiness;

/**
 *
 * @author robertbrown
 */
public class Bet extends SuperClass {
    //declaring variables of sub class
    private String sport;
    private String teamName;
    private String horseName;
    private double bet;
    
    //constructor
    public Bet(){
        super();
        String sport = " ";
        String teamName = " ";
        String horseName =" ";
        double bet = 0;
        
    }
    
    //overloaded constructor
    public Bet(String sport, String teamName,String horseName, double bet, double odd, double steak){
        super();
        this.sport=sport;
        this.teamName=teamName;
        this.horseName=horseName;
        this.bet=bet;
    }
    
    public String getHorseName() {
        return horseName;
    }

    //setters and getter
    public void setHorseName(String horseName) {    
        this.horseName = horseName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }
    
    
    
    
}
