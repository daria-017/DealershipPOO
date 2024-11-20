/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author aa437
 */
public class Car extends Vehicle {
    private int mileage, topSpeed;
    private boolean isConvertible, abs, gps;
    private String body; //(Cabrio, SUV etc)
    
    public Car() {
        this(0, 0, false, false, false, "");
    }
    
    public Car(int mileage, int topSpeed, boolean isConvertible, boolean abs, boolean gps, String body) {
        this.mileage = mileage;
        this.topSpeed = topSpeed;
        this.isConvertible = isConvertible;
        this.abs = abs;
        this.gps = gps;
        this.body = body;
    }
    
    public Car(Car car) {
        this.mileage = car.mileage;
        this.topSpeed = car.topSpeed;
        this.isConvertible = car.isConvertible;
        this.abs = car.abs;
        this.gps = car.gps;
        this.body = car.body;
    }
    
    // Setters:
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setIsConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    // Getters:
    public int getMileage() {
        return this.mileage;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public boolean isIsConvertible() {
        return this.isConvertible;
    }

    public boolean isAbs() {
        return this.abs;
    }

    public boolean isGps() {
        return this.gps;
    }

    public String getBody() {
        return this.body;
    }
    
    // toString method:
    @Override
    public String toString() {
        return "Car{" + "mileage=" + this.mileage + ", topSpeed=" + this.topSpeed + ", isConvertible=" + this.isConvertible + ", abs=" + this.abs + ", gps=" + this.gps + ", body=" + this.body + '}';
    }
}
