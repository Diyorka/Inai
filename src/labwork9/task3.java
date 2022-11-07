package labwork9;

import java.util.HashSet;
import java.util.TreeSet;

public class task3 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(7);
        set.add(15);
        set.add(19);

        TreeSet<Integer> set2 = new TreeSet<>(set);
        System.out.println(set2);
    }
}
