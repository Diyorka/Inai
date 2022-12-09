package labwork15.task7;

import labwork15.task1.Printable;

public class Task7 {
    public static void main(String[] args) {
        Printable printable = System.out::println;
        printable.print("Im Diyor");
    }
}
