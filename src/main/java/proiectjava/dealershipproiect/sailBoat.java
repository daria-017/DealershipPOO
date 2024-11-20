package proiectjava.dealershipproiect;

/**
 *
 * @author Dragos :>
 */
public class sailBoat {

    private int nauticalMiles;
    private Engine engine;
    private Transmission transmission;
    private boolean sonar;
    private boolean hasLifeBuoy;

    sailBoat() {
        nauticalMiles = 0;
        engine = new Engine();
        transmission = new Transmission();
        sonar = false;
        hasLifeBuoy = false;
    }

    sailBoat(int nauticalMiles, Engine engine, Transmission transmission, boolean sonar, boolean hasLifeBuoy) {
        this.nauticalMiles = nauticalMiles;
        this.engine = engine;
        this.transmission = transmission;
        this.sonar = sonar;
        this.hasLifeBuoy = hasLifeBuoy;
    }

    sailBoat(sailBoat b) {
        this.nauticalMiles = b.nauticalMiles;
        this.engine = b.engine;
        this.transmission = b.transmission;
        this.sonar = b.sonar;
        this.hasLifeBuoy = b.hasLifeBuoy;
    }

    @Override
    public String toString() {
        return "Nautical Miles = " + nauticalMiles + ", Engine = " + engine + ", Transmission = " + transmission
                + ", Sonar = " + sonar + ", Has Life Buoy = " + hasLifeBuoy;
    }
}
