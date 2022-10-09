package labwork5.B.clothes;

public class Pants extends Clothes implements MensClothes, WomensClothes{
    public Pants(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает штаны");
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер=" + size +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}';
    }
}
