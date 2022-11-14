package labwork11.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел хотите положить в массив:");
        double[] mas = new double[sc.nextInt()];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Введите число:");
            mas[i] = sc.nextInt();
        };

        MassiveSum massiveSum = (massive) -> {
            double sum=0;
            for (double v : massive) {
                sum += v;
            }
            return sum;
        };

        System.out.println("Сумма: " + massiveSum.Sum(mas));
    }
}
