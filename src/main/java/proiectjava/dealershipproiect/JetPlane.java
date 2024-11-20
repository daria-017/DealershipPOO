/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proiectjava.dealershipproiect;

/**
 *
 * @author Daria
 */
public class JetPlane extends Vehicle {
    private int maxAltitude; // Altitudine maximă (în picioare sau metri)
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private boolean militaryAircraft; // Este avion militar sau nu
    private boolean luggageCapacity;  // Are capacitate pentru bagaje?
    private String propulsionSystem;  // Tipul sistemului de propulsie
    private boolean highSpeed;        // Este un avion de mare viteză?
    private int engineCycles;         // Număr de cicluri ale motorului
    private Engine engine;            // Instanță a clasei Engine
    private Transmission transmission;// Instanță a clasei Transmission

    // Constructor implicit
    public JetPlane() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.militaryAircraft = false;
        this.luggageCapacity = false;
        this.propulsionSystem = "";
        this.highSpeed = false;
        this.engineCycles = 0;
        this.engine = null;
        this.transmission = null;
    }

    // Constructor cu toți parametrii
    public JetPlane(int id, int year, int price, int weight, String brand, String model, String color,
                    Transmission transmission, Engine engine, int maxAltitude, int maxRange, int maxSpeed,
                    boolean militaryAircraft, boolean luggageCapacity, String propulsionSystem, boolean highSpeed,
                    int engineCycles) {
        super(id, year, price, weight, brand, model, color, transmission, engine, null);
        this.maxAltitude = maxAltitude;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.militaryAircraft = militaryAircraft;
        this.luggageCapacity = luggageCapacity;
        this.propulsionSystem = propulsionSystem;
        this.highSpeed = highSpeed;
        this.engineCycles = engineCycles;
        this.engine = engine;
        this.transmission = transmission;
    }

    // Constructor de copiere
    public JetPlane(JetPlane jetplane) {
        super(jetplane.id, jetplane.year, jetplane.price, jetplane.weight, jetplane.brand, jetplane.model, jetplane.color,
              other.transmission, other.engine, other.photo);
        this.maxAltitude = other.maxAltitude;
        this.maxRange = other.maxRange;
        this.maxSpeed = other.maxSpeed;
        this.militaryAircraft = other.militaryAircraft;
        this.luggageCapacity = other.luggageCapacity;
        this.propulsionSystem = other.propulsionSystem;
        this.highSpeed = other.highSpeed;
        this.engineCycles = other.engineCycles;
        this.engine = other.engine;
        this.transmission = other.transmission;
    }

    // Getters și Setters
    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isMilitaryAircraft() {
        return militaryAircraft;
    }

    public void setMilitaryAircraft(boolean militaryAircraft) {
        this.militaryAircraft = militaryAircraft;
    }

    public boolean hasLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(boolean luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public String getPropulsionSystem() {
        return propulsionSystem;
    }

    public void setPropulsionSystem(String propulsionSystem) {
        this.propulsionSystem = propulsionSystem;
    }

    public boolean isHighSpeed() {
        return highSpeed;
    }

    public void setHighSpeed(boolean highSpeed) {
        this.highSpeed = highSpeed;
    }

    public int getEngineCycles() {
        return engineCycles;
    }

    public void setEngineCycles(int engineCycles) {
        this.engineCycles = engineCycles;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return 
    }
}

