package proiectjava.dealershipproiect;

/**
 *
 * @author Dragos :>
 */
public class Boat extends Vehicle{

    private int nauticalMiles;
    private Engine engine;
    private Transmission transmission;
    private boolean sonar;
    private String propulsionType;

    Boat() {
        nauticalMiles = 0;
        engine = new Engine();
        transmission = new Transmission();
        sonar = false;
        propulsionType = "<empty>";
    }

    Boat(int nauticalMiles, Engine engine, Transmission transmission, boolean sonar, String propulsionType) {
        this.nauticalMiles = nauticalMiles;
        this.engine = engine;
        this.transmission = transmission;
        this.sonar = sonar;
        this.propulsionType = propulsionType;
    }

    Boat(Boat b) {
        this.nauticalMiles = b.nauticalMiles;
        this.engine = b.engine;
        this.transmission = b.transmission;
        this.sonar = b.sonar;
        this.propulsionType = b.propulsionType;
    }

    @Override
    public String toString() {
        return "Nautical Miles = " + nauticalMiles + ", Engine = " + engine + ", Transmission = " + transmission
                + ", Sonar = " + sonar + ", Propulsion Type = " + propulsionType;
    }

}
