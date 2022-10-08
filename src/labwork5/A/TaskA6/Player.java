package labwork5.A.TaskA6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Player implements Technic{

    private String name;
    private String mark;
    private int productionYear;

    public Player(){}

    public Player(String name, String mark, int productionYear) {
        this.name = name;
        this.mark = mark;
        this.productionYear = productionYear;
    }
    public abstract void play();
    public abstract void shuffle();
    public abstract void show();

    @Override
    public void turnOn() {
        System.out.println("Player is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Player is off");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }
}
