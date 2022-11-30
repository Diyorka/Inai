package labwork13.Task2;

public class Thread1 extends Thread{
    public Printer printer;

    @Override
    public void run() {
        printer = new Printer();
        printer.printing("Thread1","file");
    }
}
