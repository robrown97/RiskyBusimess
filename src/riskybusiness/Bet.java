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
    private String name;
    private double bet;
    
    //constructor
    public Bet(){
        super();
        String sport = " ";
        String name = " ";
        double bet = 0;
    }
    
    //overloaded constructor
    public Bet(String sport, String name, Double bet){
        super();
        this.sport=sport;
        this.name=name;
        this.bet=bet;
    }
    
    //setters and getter
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }
    
    
    
    
}
