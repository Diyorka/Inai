package labwork10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько ключ-значений хотите ввести?");
        int n = Integer.parseInt(sc.nextLine());

        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Введите ключ:");
            String key = sc.nextLine();
            System.out.println("Введите значение:");
            map.put(key, sc.nextLine());
        }

        System.out.println("Ваши ключи и значения:");
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
