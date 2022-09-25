package labwork3.B9.planes;

public class PublicAirPlane extends Plane{

    private String airPort;

    public PublicAirPlane(String name, double flyingRange, double capacity, double carryingCapacity, double fuelConsumption, String airPort) {
        super(name, flyingRange, capacity, carryingCapacity, fuelConsumption);
        this.airPort = airPort;
    }

    public String getAirPort() {
        return airPort;
    }

    public void setAirPort(String airPort) {
        this.airPort = airPort;
    }

}
