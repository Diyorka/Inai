package labwork8;

import java.util.HashSet;
import java.util.Set;

public class task5 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 5; i < 25; i++) {
            set.add(i);
        }

        set.removeIf(integer -> integer>10);
        System.out.println(set);
    }
}
