package labwork3.B7.equipment;

public class Helmet extends Equipment{
    private String size;
    private String color;

    public Helmet(String name, double weight, int price, String size, String color) {
        super(name, weight, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
