package labwork11.Task8;

import java.beans.Expression;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите периметр:");
        double p = sc.nextInt();


        Length length = per->per*3.14*2;

        System.out.println("Длина окружности: " + calc(length, p));

    }

    public static double calc(Length length, double p){
        return length.Calculate(p);
    }
}
