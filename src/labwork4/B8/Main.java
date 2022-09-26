package labwork4.B8;

import labwork4.B8.carriages.BusinessClassCarriage;
import labwork4.B8.carriages.Carriage;
import labwork4.B8.carriages.EconomClassCarriage;
import labwork4.B8.carriages.MiddleClassCarriage;
import labwork4.B8.comparator.CarriageComparator;
import labwork4.B8.train.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создаем объекты вагонов
        EconomClassCarriage economClassCarriage = new EconomClassCarriage(
                3,200, 1248, 1);
        MiddleClassCarriage middleClassCarriage = new MiddleClassCarriage(
                2,120, 739, 2);
        BusinessClassCarriage businessClassCarriage = new BusinessClassCarriage(
               1, 50, 285, 3);

        List<Carriage> carriageList = new ArrayList<>();
        carriageList.add(economClassCarriage);
        carriageList.add(middleClassCarriage);
        carriageList.add(businessClassCarriage);

        // Создаем объект поезда
        Train train = new Train("Bishkek Issyk-Kul Train", carriageList);
        System.out.println("Название поезда: " + train.getName());

        // Считаем пассажиров и багаж
        int passengersCount = 0;
        double goodsTotalWeight = 0.0;
        for (Carriage carriage : train.getCarriageList()){
            passengersCount += carriage.getPassengersNumber();
            goodsTotalWeight += carriage.getGoodsWeight();
        }

        System.out.println("Общее количество пассажиров: " + passengersCount);
        System.out.println("Общий вес багажа: " + goodsTotalWeight + " kg");
        System.out.println();


        // Сортируем на основе уровня комфортности
        CarriageComparator carriageComparator = new CarriageComparator();
        train.getCarriageList().sort(carriageComparator);

        System.out.println("Сортировка по уровню комфортности:");
        for (Carriage carriage : train.getCarriageList()){
            System.out.println("Номер вагона: " + carriage.getId() +
                    ", уровень комфортности: " + carriage.getComfortLevel());
        }
        System.out.println();

        // Ищем вагоны по заданному диапазону числа пассажиров
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диапазон числа пассажиров(например: 0 100):");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (Carriage carriage : train.getCarriageList()){
            if(carriage.getPassengersNumber()>=a && carriage.getPassengersNumber()<=b){
                System.out.println("Номер вагона: " + carriage.getId() +
                        ", количество пассажировов: " + carriage.getPassengersNumber());
            }
        }

    }
}
