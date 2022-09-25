package labwork3.A2;

public class Car {
    private Wheel wheel;
    private Engine engine;
    private String markAndModel;
    private int yearOfProduction;

    public Car(String markAndModel, int yearOfProduction, Engine engine, Wheel wheel) {
        this.wheel = wheel;
        this.engine = engine;
        this.markAndModel = markAndModel;
        this.yearOfProduction = yearOfProduction;
    }

    public void go(){
        System.out.println(markAndModel + " is going");
    }

    public void fill(){
        System.out.println(markAndModel + " was filled");
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void changeWheel(Wheel wheel) {
        this.wheel = wheel;
        System.out.println("You changed wheel on " + markAndModel);
    }

    public Engine getEngine() {
        return engine;
    }

    public void changeEngine(Engine engine) {
        this.engine = engine;
    }

    public String getMarkAndModel() {
        return markAndModel;
    }

    public void setMarkAndModel(String markAndModel) {
        this.markAndModel = markAndModel;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" + wheel +
                ", engine=" + engine +
                ", markAndModel='" + markAndModel + '\'' +
                '}';
    }
}
