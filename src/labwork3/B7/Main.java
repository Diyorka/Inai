package labwork3.B7;

import labwork3.B7.comparator.EquipmentComparator;
import labwork3.B7.equipment.*;
import labwork3.B7.model.Motorcyclist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создаем объекты экипировки
        Jacket jacket = new Jacket("Elite jack",1.670, 5700, "summer", "M");
        Helmet helmet = new Helmet("Helmet 1300",1.300, 7900, "M", "Black");
        Pants pants = new Pants("H&M pants",1.500, 9000, "summer", "M");
        Gloves gloves = new Gloves("Gloves M",0.500, 3000, "M");
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(jacket);
        equipmentList.add(helmet);
        equipmentList.add(pants);
        equipmentList.add(gloves);


        // Объект мотоциклиста
        Motorcyclist motorcyclist = new Motorcyclist("Diyor", equipmentList);
        System.out.println("Мотоциклист: " + motorcyclist.getName());

        // Стоимость экипировки
        int totalPrice=0;
        for(Equipment equipment : motorcyclist.getEquipmentList()){
            totalPrice+=equipment.getPrice();
        }
        System.out.println("Стоимость экипировки: " + totalPrice);
        System.out.println();

        // Сортировка по весу
        EquipmentComparator equipmentComparator = new EquipmentComparator();
        motorcyclist.getEquipmentList().sort(equipmentComparator);

        System.out.println("Сортировка по весу:");
        for (Equipment equipment : motorcyclist.getEquipmentList()){
            System.out.println(equipment.getName() + ", вес: " + equipment.getWeight());
        }
        System.out.println();


        // Вывод элементов экипировки в заданном диапазоне
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диапазон цен(например: 1000 10000):");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (Equipment equipment : motorcyclist.getEquipmentList()){
            if(equipment.getPrice()>=a && equipment.getPrice()<=b){
                System.out.println(equipment.getName() + ", цена: " + equipment.getPrice());
            }
        }

    }
}
