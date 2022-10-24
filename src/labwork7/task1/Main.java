package labwork7.task1;

public class Main {
    public static void main(String[] args) {
        Integer[] mas1 = {1, 2, 3};
        String[] mas2 = {"Hello", "World"};

        printArray(mas1);
        printArray(mas2);

    }
    public static <T> void printArray(T[] mas){
        for(T element : mas){
            System.out.println(element);
        }
    }
}
