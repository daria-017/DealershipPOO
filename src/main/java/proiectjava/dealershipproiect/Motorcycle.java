/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author aa437
 */
public class Motorcycle extends Vehicle {
    private int mileage, topSpeed;
    private boolean abs, sport;
    private String type; // Crossroad, Speed etc.

    public Motorcycle() {
        this(0, 0, false, false, "");
    }

    public Motorcycle(int mileage, int topSpeed, boolean abs, boolean sport, String type) {
        this.mileage = mileage;
        this.topSpeed = topSpeed;
        this.abs = abs;
        this.sport = sport;
        this.type = type;
    }
    
    public Motorcycle(Motorcycle motorcycle) {
        this.mileage = motorcycle.mileage;
        this.topSpeed = motorcycle.topSpeed;
        this.abs = motorcycle.abs;
        this.sport = motorcycle.sport;
        this.type = motorcycle.type;
    }
    
    // Setter:
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setSport(boolean sport) {
        this.sport = sport;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    // Getter:
    public int getMileage() {
        return this.mileage;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public boolean isAbs() {
        return this.abs;
    }

    public boolean isSport() {
        return this.sport;
    }

    public String getType() {
        return this.type;
    }
    
    // toString method:
    @Override
    public String toString() {
        return "Motorcycle{" + "mileage=" + this.mileage + ", topSpeed=" + this.topSpeed + ", abs=" + this.abs + ", sport=" + this.sport + ", type=" + this.type + '}';
    }
}