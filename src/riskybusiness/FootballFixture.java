/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riskybusiness;

import java.io.Serializable;

/**
 *
 * @author Eoghan
 */
public class FootballFixture extends Fixture implements Serializable{
    private String teamName;

    public FootballFixture() {
        super();
        teamName = "";
    }

    public FootballFixture(String teamName, double odds) {
        super(odds);
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    protected String getFixtureString() {
        return "Football - Team: " + teamName + " - Odds: " + odds;
    }
    
    
}
