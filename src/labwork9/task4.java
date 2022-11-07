package labwork9;

import java.util.HashSet;
import java.util.TreeSet;

public class task4 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(7);
        set.add(15);
        set.add(19);

        System.out.println(set.descendingSet());

    }
}
