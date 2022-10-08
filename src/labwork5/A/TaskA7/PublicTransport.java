package labwork5.A.TaskA7;

import java.util.ArrayList;
import java.util.List;

public abstract class PublicTransport implements Transport{
    private int price;
    private String name;
    private int seatsNumber;
    private String routeStart;
    private String routeEnd;

    private List<String> stops;
    private int currentStopIndex = 0;

    public PublicTransport(int price, String name, int seatsNumber, List<String> stops) {
        this.price = price;
        this.name = name;
        this.seatsNumber = seatsNumber;
        this.routeStart = stops.get(0);
        this.routeEnd = stops.get(stops.size()-1);
        this.stops = stops;
    }

    public abstract void stopAtPublicTransportStop();
    public abstract void driveByRoute();
    public abstract void openDoors();
    public abstract void closeDoors();


    @Override
    public void powerOff() {
        System.out.println("powers off");
    }

    @Override
    public void powerOn() {
        System.out.println("powers on");
    }

    @Override
    public void drive() {
        driveByRoute();
    }

    @Override
    public void stop() {
        stopAtPublicTransportStop();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getRouteStart() {
        return routeStart;
    }

    public void setRouteStart(String routeStart) {
        this.routeStart = routeStart;
    }

    public String getRouteEnd() {
        return routeEnd;
    }

    public void setRouteEnd(String routeEnd) {
        this.routeEnd = routeEnd;
    }

    public List<String> getStops() {
        return stops;
    }

    public void setStops(List<String> stops) {
        this.stops = stops;
    }

    public int getCurrentStopIndex() {
        return currentStopIndex;
    }

    public void setCurrentStopIndex(int currentStopIndex) {
        this.currentStopIndex = currentStopIndex;
    }

    @Override
    public String toString() {
        return
                "price=" + price +
                ", name='" + name + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", routeStart='" + routeStart + '\'' +
                ", routeEnd='" + routeEnd + '\'' +
                ", stops=" + stops + ","
                ;
    }
}

