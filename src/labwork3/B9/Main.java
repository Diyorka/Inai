package labwork3.B9;

import labwork3.B9.AviationCompany.AviaCompany;
import labwork3.B9.comparator.PlaneComparator;
import labwork3.B9.planes.Plane;
import labwork3.B9.planes.PrivateAirPlane;
import labwork3.B9.planes.PublicAirPlane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Создаем объекты экипировки
        Plane publicAirPlane = new PublicAirPlane("Airbus A220",6600,
                108,71,1000,"Mirabel Airport");

        Plane privateAirPlane = new PrivateAirPlane("PrivateAirPlane",1609,
                7,70,600,"International Council of Aircraft");

        List<Plane> planesList = new ArrayList<>();
        planesList.add(publicAirPlane);
        planesList.add(privateAirPlane);


        // Объект Авиа Компании
        AviaCompany aviaCompany = new AviaCompany("Avia Company KLG", planesList);
        System.out.println("Авиакомпания: " + aviaCompany.getName());

        // Общая вместимость
        int totalCapacity=0;
        for(Plane plane: aviaCompany.getAirPlanesList()){
            totalCapacity+=plane.getCapacity();
        }
        System.out.println("Общая вместимость: " + totalCapacity + " человек");
        System.out.println();


        // Общая грузоподъемность
        int totalCarryingCapacity=0;
        for(Plane equipment : aviaCompany.getAirPlanesList()){
            totalCarryingCapacity+=equipment.getCarryingCapacity();
        }
        System.out.println("Общая грузоподъемность: " + totalCarryingCapacity + " ft3 / " + totalCarryingCapacity*Plane.ft3ToTon + " ton");
        System.out.println();


        // Сортировка по дальности полета
        PlaneComparator planeComparator = new PlaneComparator();
        aviaCompany.getAirPlanesList().sort(planeComparator);

        System.out.println("Сортировка по дальности полета:");
        for (Plane plane : aviaCompany.getAirPlanesList()){
            System.out.println(plane.getName() + ", дальности полета: " + plane.getFlyingRange() + " км");
        }
        System.out.println();


        // Вывод элементов экипировки в заданном диапазоне
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диапазон потребления горючего(например: 400 10000):");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (Plane plane : aviaCompany.getAirPlanesList()){
            if(plane.getFuelConsumption()>=a && plane.getFuelConsumption()<=b){
                System.out.println(plane.getName() + ", потребление горючего: " + plane.getFuelConsumption() + " литров за поездку");
            }
        }
    }
}
