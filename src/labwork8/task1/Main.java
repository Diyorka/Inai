package labwork8.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "hello", "world", "this","is", "java", "java");

        System.out.println(list);
        System.out.println(getWithoutDuplicates(list));
    }

    public static Collection<?> getWithoutDuplicates(Collection<?> collection){
        return new HashSet<>(collection);
    }
}
