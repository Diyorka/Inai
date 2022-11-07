package labwork9;

import java.util.TreeSet;

public class task7 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(7);
        set.add(5);
        set.add(15);
        set.add(3);

        System.out.println("Числа меньше 7 в TreeSet:");
        for(Integer i : set){
            if(i < 7)
                System.out.println(i);
        }
    }
}
