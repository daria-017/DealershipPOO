package proiectjava.dealershipproiect;

public class AirPlane extends Vehicle {
    private int maxAltitude; // Altitudine maximă (în picioare sau metri)
    private int maxRange;    // Distanța maximă (în kilometri)
    private int maxSpeed;    // Viteza maximă (în km/h)
    private int passengerCapacity; // Număr de pasageri
    private int numberOfWings;     // Număr de aripi
    private int engineCycles;      // Număr de cicluri ale motorului
    private boolean luggageCapacity; // Are capacitate pentru bagaje?
    private boolean cargo;          // Este destinat transportului de mărfuri?
    private boolean highSpeed;      // Este un avion de mare viteză?
    private String category;        // Categoria avionului (business, comercial, etc.)

    // Constructor implicit
    public AirPlane() {
        super();
        this.maxAltitude = 0;
        this.maxRange = 0;
        this.maxSpeed = 0;
        this.passengerCapacity = 0;
        this.numberOfWings = 0;
        this.engineCycles = 0;
        this.luggageCapacity = false;
        this.cargo = false;
        this.highSpeed = false;
        this.category = "unknown";
    }

//    // Constructor cu toți parametrii
//    public AirPlane(int id, int year, int price, int weight, String brand, String model, String color,
//                    /*Transmission transmission, Engine engine,*/ int maxAltitude, int maxRange, int maxSpeed,
//                    int passengerCapacity, int numberOfWings, boolean luggageCapacity, boolean cargo,
//                    boolean highSpeed, String category, int engineCycles) {
//        super(id, year, price, weight, brand, model, color, /*transmission, engine, */photo);
//        this.maxAltitude = maxAltitude;
//        this.maxRange = maxRange;
//        this.maxSpeed = maxSpeed;
//        this.passengerCapacity = passengerCapacity;
//        this.numberOfWings = numberOfWings;
//        this.luggageCapacity = luggageCapacity;
//        this.cargo = cargo;
//        this.highSpeed = highSpeed;
//        this.category = category;
//        this.engineCycles = engineCycles;
//    }
//
//    // Constructor de copiere
//    public AirPlane(AirPlane other) {
//        super(other.id, other.year, other.price, other.weight, other.brand, other.model, other.color,
//              other.transmission, other.engine, other.photo);
//        this.maxAltitude = other.maxAltitude;
//        this.maxRange = other.maxRange;
//        this.maxSpeed = other.maxSpeed;
//        this.passengerCapacity = other.passengerCapacity;
//        this.numberOfWings = other.numberOfWings;
//        this.luggageCapacity = other.luggageCapacity;
//        this.cargo = other.cargo;
//        this.highSpeed = other.highSpeed;
//        this.category = other.category;
//        this.engineCycles = other.engineCycles;
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
//    public int getPassengerCapacity() {
//        return passengerCapacity;
//    }
//
//    public void setPassengerCapacity(int passengerCapacity) {
//        this.passengerCapacity = passengerCapacity;
//    }
//
//    public int getNumberOfWings() {
//        return numberOfWings;
//    }
//
//    public void setNumberOfWings(int numberOfWings) {
//        this.numberOfWings = numberOfWings;
//    }
//
//    public int getEngineCycles() {
//        return engineCycles;
//    }
//
//    public void setEngineCycles(int engineCycles) {
//        this.engineCycles = engineCycles;
//    }
//
//    public boolean hasLuggageCapacity() {
//        return luggageCapacity;
//    }
//
//    public void setLuggageCapacity(boolean luggageCapacity) {
//        this.luggageCapacity = luggageCapacity;
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
//    public boolean isHighSpeed() {
//        return highSpeed;
//    }
//
//    public void setHighSpeed(boolean highSpeed) {
//        this.highSpeed = highSpeed;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    // Suprascrierea metodei toString()
//    @Override
//    public String toString() {
//        return "AirPlane {"
//    }
}