package labwork4.B9.planes;

public class PublicAirPlane implements Plane {
    private String name;
    private double flyingRange;
    private double capacity;
    private double carryingCapacity;
    private double fuelConsumption;
    private String airPort;

    public PublicAirPlane(String name, double flyingRange, double capacity, double carryingCapacity, double fuelConsumption, String airPort) {
        this.name = name;
        this.flyingRange = flyingRange;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.fuelConsumption = fuelConsumption;
        this.airPort = airPort;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(double flyingRange) {
        this.flyingRange = flyingRange;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getAirPort() {
        return airPort;
    }

    public void setAirPort(String airPort) {
        this.airPort = airPort;
    }
}
