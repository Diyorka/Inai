package labwork14.task2;

public class Task2 {
    public static void main(String[] args) {
        Thread newRunnable = new Thread(new NewRunnable());
        Thread newRunnable1 = new Thread(new NewRunnable());
        Thread newRunnable2 = new Thread(new NewRunnable());
        newRunnable.start();
        newRunnable1.start();
        newRunnable2.start();
    }
}
