package labwork3.B9.planes;

public abstract class Plane {
    public static final double ft3ToTon = 40;
    private String name;
    private double flyingRange;
    private double capacity;
    private double carryingCapacity;
    private double fuelConsumption;


    public Plane(String name, double flyingRange, double capacity, double carryingCapacity, double fuelConsumption) {
        this.name = name;
        this.flyingRange = flyingRange;
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(double flyingRange) {
        this.flyingRange = flyingRange;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }
    public double getCarryingCapacityTon() {
        return carryingCapacity * ft3ToTon;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
