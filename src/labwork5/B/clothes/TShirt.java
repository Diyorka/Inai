package labwork5.B.clothes;

public class TShirt extends Clothes implements MensClothes, WomensClothes{
    public TShirt(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает футболку");
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "размер=" + size +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}';
    }
}
