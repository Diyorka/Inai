package labwork11.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int num = sc.nextInt();
        Reverse reverse = x -> {
            String s = "";
            if(String.valueOf(x).length()!=3)
                return "Введено не трехзначное число!";

            s+=x%10;
            x/=10;
            s+=x%10;
            x/=10;
            s+=x%10;
            return "Число в обратном порядке: " + s;
        };

        System.out.println(reverse.Reversing(num));
    }
}
