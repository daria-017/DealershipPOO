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

private class Jetski extends Vehicles{
    private int nauticalMiles;
    private boolean handlebars;
    private String propulsionSystem;
    private Engine engine;
    //Transmission

    public Jetski(){
        this(0,false,"",new Engine("",0,0,""));
    }
    
    public Jetski(int nauticalMiles, boolean handlebars, String propulsionSystem, Engine engine) {
        this.nauticalMiles = nauticalMiles;
        this.handlebars = handlebars;
        this.propulsionSystem = propulsionSystem;
        this.engine = engine;
    }

    public int getNauticalMiles() {
        return nauticalMiles;
    }

    public void setNauticalMiles(int nauticalMiles) {
        this.nauticalMiles = nauticalMiles;
    }

    public boolean isHandlebars() {
        return handlebars;
    }

    public void setHandlebars(boolean handlebars) {
        this.handlebars = handlebars;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Jetski(Jetski copy) {
        this.nauticalMiles = copy.nauticalMiles;
        this.handlebars = copy.handlebars;
        this.propulsionSystem = copy.propulsionSystem;
        this.engine = copy.engine;
    }
    
    @Override
    public String toString() {
        return "Jetski{" + "nauticalMiles=" + nauticalMiles + ", handlebars=" + handlebars + ", propulsionSystem=" + propulsionSystem + ", engine=" + engine + '}';
    }
