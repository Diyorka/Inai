package labwork3.A3;

public class Engine {
    private String name;
    private double volume;

    public Engine(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
