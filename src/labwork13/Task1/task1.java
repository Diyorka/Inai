package labwork13.Task1;

import java.util.HashMap;

public class task1 {
    public static void main(String[] args) throws InterruptedException {

        task1Runnable something = new task1Runnable();
        Thread thread = new Thread(something);


        Thread thread1 = new Thread(() -> {

            HashMap<String, String> questions;
            questions = new HashMap<>();
            questions.put("2 в квадрате", "4");
            questions.put("Население земли", "8 млрд");
            questions.put("Столица Кыргызстана", "Бишкек");
            questions.put("Столица России", "Москва");
            questions.put("Столица Узбекистана", "Ташкент");
            questions.put("Столица Казахстана", "Астана");
            questions.put("Столица США", "Вашингтон");
            questions.put("Столица Англии", "Лондон");
            questions.put("Столица Японии", "Токио");
            questions.put("Столица Канады", "Торонто");

            for (String key: questions.keySet()) {
                System.out.println("Hello, " + key);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(questions.get(key));
            }
        });

        thread.start();
        thread1.start();
    }
}
