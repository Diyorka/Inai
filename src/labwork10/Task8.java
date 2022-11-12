package labwork10;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task8 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Diyor", "18");
        map.put("Aziz", "19");
        map.put("Kolya", "18");

        for (Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
