package labwork14.task3;

public class NewThread extends Thread{
    private final StringBuilder stringBuilder;

    public NewThread(StringBuilder sb) {
        this.stringBuilder = sb;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 0; i < 100; i++) {
                System.out.println(stringBuilder + " " + i);
            }
            char ch = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++ch);
        }
    }
}
