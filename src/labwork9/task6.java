package labwork9;

import java.util.HashSet;
import java.util.TreeSet;

public class task6 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        set.add(2);
        set.add(7);
        set.add(15);
        set.add(19);

        set2.add(1);
        set2.add(7);
        set2.add(19);
        set2.add(11);

        TreeSet<Integer> equals = new TreeSet<>();
        for(Integer i : set){
            if(set2.contains(i))
                equals.add(i);
        }

        System.out.println(equals);


    }
}
