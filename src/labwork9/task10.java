package labwork9;

import labwork9.task9.Car;

import java.util.TreeSet;

public class task10 {
    public static void main(String[] args) {
        TreeSet<Car> set = new TreeSet<>();
        set.add(new Car("BMW", "X5", 2017));
        set.add(new Car("Mercedes-Benz", "E500", 2012));
        set.add(new Car("Toyota", "Land-Cruiser 300", 2021));

        for(Car car:set){
            System.out.println(car.getBrandName() + " "+ car.getModel() + " "+car.getReleaseYear());
        }
    }
}
