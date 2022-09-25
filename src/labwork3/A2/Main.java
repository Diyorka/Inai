package labwork3.A2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Chevrolet engine", 1.0);
        Wheel wheel = new Wheel("summer", 15);
        Car spark = new Car("Chevrolet Spark", 2016, engine, wheel);

        spark.go();
        spark.fill();

        Wheel wheel1 = new Wheel("winter", 15);
        spark.changeWheel(wheel1);
        System.out.println("Mark and model of your car: " + spark.getMarkAndModel());
    }
}
