package labwork5.A.TaskA7;

import java.util.Collections;
import java.util.List;

public class Tramvai extends PublicTransport{

    private String mark;
    private double electricityСonsumption;

    public Tramvai(int price, String name, int seatsNumber, List<String> stops,String mark, double electricityСonsumption) {
        super(price,name,seatsNumber,stops);
        this.mark = mark;
        this.electricityСonsumption = electricityСonsumption;
    }

    @Override
    public void stopAtPublicTransportStop() {
        System.out.println("Tramvai stopped at Bus Stop - " + getStops().get(getCurrentStopIndex()));
        if(getStops().get(getCurrentStopIndex()).equals(getRouteEnd())){
            Collections.reverse(getStops());
            setCurrentStopIndex(1);
        }else{
            setCurrentStopIndex(getCurrentStopIndex()+1);
        }
    }

    @Override
    public void driveByRoute() {
        System.out.println("Driving by Route");
    }

    @Override
    public void openDoors() {
        System.out.println("Doors opening");
    }

    @Override
    public void closeDoors() {
        System.out.println("Doors closed");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getElectricityСonsumption() {
        return electricityСonsumption;
    }

    public void setElectricityСonsumption(double electricityСonsumption) {
        this.electricityСonsumption = electricityСonsumption;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {

        return
                "Tramvai{" + super.toString() +
                " mark='" + mark + '\'' +
                ", electricityСonsumption=" + electricityСonsumption +
                '}';
    }
}
