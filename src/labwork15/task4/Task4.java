package labwork15.task4;

import java.util.function.Consumer;

public class Task4 {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(7.52);
        Consumer<HeavyBox> getWeight = heavyBox1 -> System.out.println("Отгрузили ящик с весом " + heavyBox1.getWeight());
        Consumer<HeavyBox> sendBox = heavyBox1 -> System.out.println("Отправили ящик с весом " + heavyBox1.getWeight());

        getWeight.andThen(sendBox).accept(heavyBox);

    }
}
