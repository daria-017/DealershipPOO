package proiectjava.dealershipproiect;

/**
 *
 * @author Dragos :>
 */
public class SailBoat {

    private int nauticalMiles;
    private Engine engine;
    private Transmission transmission;
    private boolean sonar;
    private boolean hasLifeBuoy;

    public SailBoat() {
        nauticalMiles = 0;
        engine = new Engine();
        transmission = new Transmission();
        sonar = false;
        hasLifeBuoy = false;
    }

    public SailBoat(int nauticalMiles, Engine engine, Transmission transmission, boolean sonar, boolean hasLifeBuoy) {
        this.nauticalMiles = nauticalMiles;
        this.engine = engine;
        this.transmission = transmission;
        this.sonar = sonar;
        this.hasLifeBuoy = hasLifeBuoy;
    }

    public SailBoat(SailBoat b) {
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
