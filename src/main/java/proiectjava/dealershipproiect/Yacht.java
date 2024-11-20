/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershippoo;

/**
 *
 * @author Raul
 */

import javax.swing.ImageIcon;
import java.awt.Color;

public class Yacht extends Vehicles{
    private int nauticalMiles;
    private int maxCrew;
    private String flag;
    private Engine engine;
    //transmission
    
    public Yacht(){
        this(0,0,"",new Engine("",0,0,""));
    }

    public Yacht(int nauticalMiles, int maxCrew, String flag, Engine engine) {
        this.nauticalMiles = nauticalMiles;
        this.maxCrew = maxCrew;
        this.flag = flag;
        this.engine = engine;
    }

    public int getNauticalMiles() {
        return nauticalMiles;
    }

    public void setNauticalMiles(int nauticalMiles) {
        this.nauticalMiles = nauticalMiles;
    }

    public int getMaxCrew() {
        return maxCrew;
    }

    public void setMaxCrew(int maxCrew) {
        this.maxCrew = maxCrew;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    
    public Yacht(Yacht copy) {
        this.nauticalMiles = copy.nauticalMiles;
        this.maxCrew = copy.maxCrew;
        this.flag = copy.flag;
        this.engine = copy.engine;
    }

    @Override
    public String toString() {
        return "Yacht{" + "nauticalMiles=" + nauticalMiles + ", maxCrew=" + maxCrew + ", flag=" + flag + ", engine=" + engine + '}';
    }
    
}
