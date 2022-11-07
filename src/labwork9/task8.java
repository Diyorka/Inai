package labwork9;

import java.util.Scanner;
import java.util.TreeSet;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(150);
        set.add(13);
        set.add(27);
        set.add(103);
        set.add(67);
        set.add(7);

        System.out.println("Введите число:");
        int n = sc.nextInt();

        System.out.println("Элементы, которые меньше или равны " + n + ":");
        for (Integer i:set){
            if(i<=n)
                System.out.println(i);
        }
    }
}
