/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author aa437 
 */
public class Truck extends Vehicle {
    private int mileage, maxWeight, capacityInKg;
    private boolean backupSound, cargoSensor;
    
    public Truck() {
        this(0, 0, 0, false, false);
    }
    
    public Truck(int mileage, int maxWeight, int capacityInKg, boolean backupSound, boolean cargoSensor) {
        this.mileage = mileage;
        this.maxWeight = maxWeight;
        this.capacityInKg = capacityInKg;
        this.backupSound = backupSound;
        this.cargoSensor = cargoSensor;
    }
    
    public Truck(Truck truck) {
        this.mileage = truck.mileage;
        this.maxWeight = truck.maxWeight;
        this.capacityInKg = truck.capacityInKg;
        this.backupSound = truck.backupSound;
        this.cargoSensor = truck.cargoSensor; 
    }
    
    // Setters:
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setCapacityInKg(int capacityInKg) {
        this.capacityInKg = capacityInKg;
    }

    public void setBackupSound(boolean backupSound) {
        this.backupSound = backupSound;
    }

    public void setCargoSensor(boolean cargoSensor) {
        this.cargoSensor = cargoSensor;
    }
    
    // Getters:
    public int getMileage() {
        return this.mileage;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public int getCapacityInKg() {
        return this.capacityInKg;
    }

    public boolean isBackupSound() {
        return this.backupSound;
    }

    public boolean isCargoSensor() {
        return this.cargoSensor;
    }
    
    // toString method:
    @Override
    public String toString() {
        return "Truck{" + "mileage=" + this.mileage + ", maxWeight=" + this.maxWeight + ", capacityInKg=" + this.capacityInKg + ", backupSound=" + this.backupSound + ", cargoSensor=" + this.cargoSensor + '}';
    }
}
