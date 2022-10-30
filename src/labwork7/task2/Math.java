package labwork7.task2;

public class Math <T extends Number> {

    public double sumNum(T[] arr) {
        double sum = 0;
        for (T element : arr) {
            sum += element.doubleValue();
        }
        return sum;
    }
}
