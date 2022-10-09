package labwork5.B.clothes;

public class Skirt extends Clothes implements WomensClothes{
    public Skirt(Sizes size, String color, int price) {
        super(size, color, price);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает юбку");
    }

    @Override
    public String toString() {
        return "Юбка{" +
                "размер=" + size +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}';
    }
}
