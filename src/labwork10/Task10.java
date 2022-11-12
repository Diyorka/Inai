package labwork10;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Task10 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(18, "18");
        map.put(19, "19");
        map.put(20, "18");
        NavigableSet<Integer> set = (NavigableSet<Integer>) map.keySet();

        System.out.println(set.stream().toList());
    }
}
