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
public class SuperClass {
    protected double odd; //odds set by bookies
    protected double stake; //amount customer bets (€)
    
    //constructor
    public SuperClass(){
        double odd=0;
        double stake=0;
    }
    //overloaded constructor
    public SuperClass(double odd, double stake) {
        this.odd = odd;
        this.stake = stake;
    }
    
    //setters and getters

    public double getOdd() {
        return odd;
    }

    public void setOdd(double odd) {
        this.odd = odd;
    }

    public double getStake() {
        return stake;
    }

    public void setStake(double stake) {
        this.stake = stake;
    }
    
    
}
