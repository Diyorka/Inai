package labwork10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("Diyor", "18");
        map.put("Aziz", "19");
        System.out.println("Введите ключ:");
        String s = sc.nextLine();

        if(map.containsKey(s))
            System.out.println("Значение "+ s +": "+ map.get(s));
        else
            System.out.println("Нет такого ключа");
    }
}
