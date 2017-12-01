/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskybusiness;

import java.io.Serializable;

/**
 *
 * @author robertbrown
 */
public class HorseBet extends SuperClass implements Serializable {
    
//declaring variables of sub class
    private String horseName;
    
    //constructor
    public HorseBet(){
        super();
        String horseName = " ";
    }
    
    //overloaded constructor
    public HorseBet(String horseName, double stake){
        super();
        this.horseName=horseName;

    }
    //setters getters
    public void setHorseName(String teamName) {
        this.horseName = horseName;
    } 
    public String getHorseName() {
        return horseName;
    }
    
}
