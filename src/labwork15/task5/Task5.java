package labwork15.task5;

import java.util.function.Function;

public class Task5 {
    public static void main(String[] args) {
        Function<Double, String> doubleType = aDouble -> {
            String type = "Ноль";
            if(aDouble > 0){
                type="Положительное число";
            }else if(aDouble < 0){
                type="Отрицательное число";
            }
            return type;
        };

        System.out.println(doubleType.apply(5.6));
        System.out.println(doubleType.apply(-7.3));
        System.out.println(doubleType.apply(0.0));
    }
}
