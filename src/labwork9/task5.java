package labwork9;

import java.util.HashSet;

public class task5 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set.add(2);
        set.add(7);
        set.add(15);
        set.add(19);

        set2.add(1);
        set2.add(5);
        set2.add(11);

        System.out.println("Одинаковы ли хэшсеты: " + (set.equals(set2)?"Да":"Нет"));
    }
}
