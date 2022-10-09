package labwork5.B.clothes;

public class Tie extends Clothes implements MensClothes{
    public Tie(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук");
    }

    @Override
    public String toString() {
        return "Галстук{" +
                "размер=" + size +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}';
    }
}
