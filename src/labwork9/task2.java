package labwork9;

import java.util.Arrays;
import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(11);
        set.add(15);

        Object[] mas = set.toArray();
        System.out.println(Arrays.toString(mas));
        System.out.println(set);
    }
}
