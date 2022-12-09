package labwork15.task3;

import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {
        Predicate<String> startWithJorN = s -> s.startsWith("J") || s.startsWith("N");
        Predicate<String> endsWithA = s -> s.endsWith("A");
        System.out.println(startWithJorN.and(endsWithA).test("JELLA"));
    }
}
