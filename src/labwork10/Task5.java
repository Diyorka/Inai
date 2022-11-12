package labwork10;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Diyor", "18");
        map.put("Aziz", "19");
        map.put("Kolya", "18");

        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
