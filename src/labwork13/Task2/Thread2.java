package labwork13.Task2;

public class Thread2 extends Thread{
    public Printer printer;

    @Override
    public void run() {
        printer = new Printer();
        printer.printing("Thread2","file");
    }
}
