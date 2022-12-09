package labwork15.task2;

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> isNull = s -> !s.isEmpty();
        System.out.println(isNull.test("Not null"));

    }
}
