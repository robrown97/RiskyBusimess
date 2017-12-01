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
    //variable
    protected double stake;
    
    //constructor
    public SuperClass(){
        double stake=0.0;
    }
    //overloaded constructor
    public SuperClass(double stake) {
        this.stake = stake;
    }
    
    //setters and getters
     public void setStake(double stake) {
        this.stake = stake;
    }
    public double getStake() {
        return stake;
    }

   
    
    
}
