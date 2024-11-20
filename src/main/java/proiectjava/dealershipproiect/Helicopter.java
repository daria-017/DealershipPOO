/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author Daria
 */


public class Helicopter extends Vehicle {
    private int maxAltitude; // Altitudine maximă (în picioare sau metri)
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private short numberOfBlades; // Număr de pale ale rotorului
    private int loudness;          // Nivel de zgomot (dB)
    private int engineCycles;      // Număr de cicluri ale motorului
    private boolean militaryAircraft; // Este elicopter militar sau nu
    private boolean cargo;          // Este destinat transportului de mărfuri?
    private String rotorType;       // Tip de rotor (de exemplu, coaxial, tandem)

    // Constructor implicit
    public Helicopter() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.numberOfBlades = 0;
        this.loudness = 0;
        this.engineCycles = 0;
        this.militaryAircraft = false;
        this.cargo = false;
        this.rotorType = "unknown";
    }

//    // Constructor cu toți parametrii
//    public Helicopter(int id, int year, int price, int weight, String brand, String model, String color,/*
//                      Transmission transmission, Engine engine,*/ int maxAltitude, int maxRange, int maxSpeed,
//                      short numberOfBlades, int loudness, int engineCycles, boolean militaryAircraft,
//                      boolean cargo, String rotorType) {
//        super(id, year, price, weight, brand, model, color, /*transmission, engine,*/ photo);
//        this.maxAltitude = maxAltitude;
//        this.maxRange = maxRange;
//        this.maxSpeed = maxSpeed;
//        this.numberOfBlades = numberOfBlades;
//        this.loudness = loudness;
//        this.engineCycles = engineCycles;
//        this.militaryAircraft = militaryAircraft;
//        this.cargo = cargo;
//        this.rotorType = rotorType;
//    }
//
//    // Constructor de copiere
//    public Helicopter(Helicopter other) {
//        super(other.id, other.year, other.price, other.weight, other.brand, other.model, other.color,
//              /*other.transmission, other.engine,*/ other.photo);
//        this.maxAltitude = other.maxAltitude;
//        this.maxRange = other.maxRange;
//        this.maxSpeed = other.maxSpeed;
//        this.numberOfBlades = other.numberOfBlades;
//        this.loudness = other.loudness;
//        this.engineCycles = other.engineCycles;
//        this.militaryAircraft = other.militaryAircraft;
//        this.cargo = other.cargo;
//        this.rotorType = other.rotorType;
//    }
//
//    // Getters și Setters
//    public int getMaxAltitude() {
//        return maxAltitude;
//    }
//
//    public void setMaxAltitude(int maxAltitude) {
//        this.maxAltitude = maxAltitude;
//    }
//
//    public int getMaxRange() {
//        return maxRange;
//    }
//
//    public void setMaxRange(int maxRange) {
//        this.maxRange = maxRange;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//
//    public short getNumberOfBlades() {
//        return numberOfBlades;
//    }
//
//    public void setNumberOfBlades(short numberOfBlades) {
//        this.numberOfBlades = numberOfBlades;
//    }
//
//    public int getLoudness() {
//        return loudness;
//    }
//
//    public void setLoudness(int loudness) {
//        this.loudness = loudness;
//    }
///*
//    public int getEngineCycles() {
//        return engineCycles;
//    }
//
//    public void setEngineCycles(int engineCycles) {
//        this.engineCycles = engineCycles;
//    }
//*/
//    public boolean isMilitaryAircraft() {
//        return militaryAircraft;
//    }
//
//    public void setMilitaryAircraft(boolean militaryAircraft) {
//        this.militaryAircraft = militaryAircraft;
//    }
//
//    public boolean isCargo() {
//        return cargo;
//    }
//
//    public void setCargo(boolean cargo) {
//        this.cargo = cargo;
//    }
//
//    public String getRotorType() {
//        return rotorType;
//    }
//
//    public void setRotorType(String rotorType) {
//        this.rotorType = rotorType;
//    }
//
//    // Suprascrierea metodei toString()
//    @Override
//    public String toString() {
//        return "Helicopter {"
//                
//    }
}

