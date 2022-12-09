package labwork15.task6;

import java.util.function.Supplier;

public class Task6 {
    public static void main(String[] args) {
        Supplier<Integer> between10and100 = () -> 1 + (int)(Math.random() * 10);
        System.out.println(between10and100.get());
    }

}
