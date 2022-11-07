package labwork9;

import java.util.HashSet;

public class task1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(11);
        set.add(15);

        for (int i : set){
            System.out.println(i);
        }
    }
}
