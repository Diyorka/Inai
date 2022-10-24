package labwork7.task3;

public class Elements {

    public <T> void printElems(T[] mas){
        for (T elem : mas){
            System.out.println(elem);
        }
    }
}
