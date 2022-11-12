package labwork10;

import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class Task9 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(18, "18");
        map.put(19, "19");
        map.put(20, "18");

        int maxvalue=Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE;

        for (Map.Entry entry:map.entrySet()){
            if((int)entry.getKey() < minvalue){
                minvalue= (int) entry.getKey();
            }else if((int)entry.getKey()>maxvalue){
                maxvalue = (int) entry.getKey();
            }
        }

        System.out.println("Минимальный ключ: " + minvalue);
        System.out.println("Максимальный ключ " + maxvalue);

    }
}



