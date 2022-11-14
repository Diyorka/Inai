package labwork11.Task1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        Multiplication calculation  = x -> x*x;
        System.out.println("Квадрат числа: " + calculation.Calculate(num));

    }
}
