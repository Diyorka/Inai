package labwork8.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощь");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
