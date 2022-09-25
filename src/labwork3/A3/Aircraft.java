package labwork3.A3;

public class Aircraft {
    private String name;
    private String route;
    private Engine engine;
    private Wing wing;
    private Chassis chassis;

    public Aircraft(String name, String route, Engine engine, Wing wing, Chassis chassis) {
        this.name = name;
        this.route=route;
        this.engine = engine;
        this.wing = wing;
        this.chassis = chassis;
    }

    public void fly(){
        System.out.println(name + " is flying!");
    }

    public void setRoute(String route){
        this.route=route;
        System.out.println("You set route to: "+route);
    }

    public String getName() {
        return name;
    }

    public String getRoute() {
        return route;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wing getWing() {
        return wing;
    }

    public Chassis getChassis() {
        return chassis;
    }
}
