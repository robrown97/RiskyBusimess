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
public class HorseRacingFixture extends Fixture implements Serializable{
    private String horseName;

    public HorseRacingFixture() {
        super();
        horseName = "";
    }

    public HorseRacingFixture(String horseName, double odds) {
        super(odds);
        this.horseName = horseName;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    @Override
    protected String getFixtureString() {
        return "Horse racing - Horse name: " + horseName + " - Odds: " + odds;
    }
    
    
    
}
