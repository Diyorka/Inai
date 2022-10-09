package labwork5.B.clothes;

public abstract class Clothes {
    Sizes size;
    String color;
    int price;

    public Clothes(Sizes size, String color, int price){
        this.size=size;
        this.color=color;
        this.price=price;
    }

    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Одежда{" +
                "размер=" + size +
                ", цвет='" + color + '\'' +
                ", цена=" + price +
                '}';
    }
}
