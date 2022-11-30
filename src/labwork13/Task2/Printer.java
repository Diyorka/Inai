package labwork13.Task2;

public class Printer {
    public void printing(String name, String files){
        System.out.println("Name - " + name);
        for (int i = 0; i < 50; i++) {
            System.out.println(name + " " + files + i);
        }
    }
}
