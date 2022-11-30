package labwork13.Task2;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Thread1 myThreading = new Thread1();
        Thread2 myThreading2 = new Thread2();
        printer.printing("Name","printer file");
        myThreading.start();
        myThreading.join();
        myThreading2.start();

    }
}
