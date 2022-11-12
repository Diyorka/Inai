package labwork9.task9;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Car> set = new HashSet<>();
        set.add(new Car("BMW", "X5", 2017));
        set.add(new Car("Mercedes-Benz", "E500", 2012));
        set.add(new Car("Toyota", "Land-Cruiser 300", 2021));

        for(Car car:set){
            System.out.println(car.getBrandName() + " "+ car.getModel() + " "+car.getReleaseYear());
        }
    }
}
