package labwork3.B9.planes;

public class PrivateAirPlane extends Plane{
    private String owner;

    public PrivateAirPlane(String name, double flyingRange, double capacity, double carryingCapacity, double fuelConsumption, String owner) {
        super(name, flyingRange, capacity, carryingCapacity, fuelConsumption);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
