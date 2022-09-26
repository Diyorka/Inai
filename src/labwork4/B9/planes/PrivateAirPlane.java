package labwork4.B9.planes;

public class PrivateAirPlane implements Plane {
    private String name;
    private double flyingRange;
    private double capacity;
    private double carryingCapacity;
    private double fuelConsumption;
    private String owner;

    public PrivateAirPlane(String name, double flyingRange, double capacity, double carryingCapacity, double fuelConsumption, String owner) {
        this.name = name;
        this.flyingRange = flyingRange;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.fuelConsumption = fuelConsumption;
        this.owner = owner;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
