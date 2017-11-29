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
public abstract class Fixture implements Serializable{
    protected double odds;

    public Fixture() {
        odds = 0.0;
    }

    public Fixture(double odds) {
        this.odds = odds;
    }

    public double getOdds() {
        return odds;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }
    
    public abstract String getFixtureString();
}
