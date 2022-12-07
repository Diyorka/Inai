package labwork14.task3;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");

        NewThread threadString = new NewThread(stringBuilder);
        NewThread threadString1 = new NewThread(stringBuilder);
        NewThread threadString2 = new NewThread(stringBuilder);
        threadString.start();
        threadString1.start();
        threadString2.start();
    }
}
