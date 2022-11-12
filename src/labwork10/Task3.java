package labwork10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("Diyor", "18");
        map.put("Aziz", "19");
        System.out.println("Введите значение:");
        String s = sc.nextLine();

        if(map.containsValue(s))
            System.out.println("Есть такое значение");
        else
            System.out.println("Нет такого значения");
    }
}
