package labwork10;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Task11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        map.put(18, "18");
        map.put(19, "19");
        map.put(20, "18");

        System.out.println("Введите ключ:");
        int key = sc.nextInt();

        for (Map.Entry entry : map.entrySet()){
            if((int)entry.getKey() > key){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }
}
