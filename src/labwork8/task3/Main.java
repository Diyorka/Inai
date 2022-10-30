package labwork8.task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Петя", new Cat("Петя"));
        map.put("Саша", new Cat("Саша"));
        map.put("Коля", new Cat("Коля"));
        map.put("Киса", new Cat("Киса"));
        map.put("Илья", new Cat("Илья"));
        map.put("Умар", new Cat("Умар"));
        map.put("Айзат", new Cat("Айзат"));
        map.put("Петр", new Cat("Петр"));
        map.put("Патрик", new Cat("Патрик"));
        map.put("Бобик", new Cat("Бобик"));

        for(Map.Entry<String, Cat> entry : map.entrySet()){
            System.out.println(entry.getValue().getName());
        }
    }
}
