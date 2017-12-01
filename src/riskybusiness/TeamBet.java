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
public class TeamBet extends SuperClass implements Serializable {
    
//declaring variables of sub class
    private String teamName;
    
    //constructor
    public TeamBet(){
        super();
        String teamName = " ";
    }
    
    //overloaded constructor
    public TeamBet(String teamName, double stake){
        super();
        this.teamName=teamName;

    }
    
    //setters getters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    } 
    public String getTeamName() {
        return teamName;
    }
    
}
