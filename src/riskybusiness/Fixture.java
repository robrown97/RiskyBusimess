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
public class Fixture implements Serializable{
    private String sport;
    private String name;
    private double odds;

    public Fixture() {
        sport = "";
        name = "";
        odds = 0.0;
    }

    public Fixture(String sport, String name, double odds) {
        this.sport = sport;
        this.name = name;
        this.odds = odds;
    }

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

    public double getOdds() {
        return odds;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }
}