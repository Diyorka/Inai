package labwork3.A3;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Airgine 2", 4.4);
        Chassis chassis = new Chassis(50);
        Wing wing = new Wing(40);

        Aircraft aircraft = new Aircraft("Airbus 320", "Bishkek", engine, wing, chassis);
        aircraft.fly();
        aircraft.setRoute("Osh");
        System.out.println("Your route: " + aircraft.getRoute());

    }
}
