package labwork4.B7.equipment;

public class Helmet implements Equipment {
    private String name;
    private double weight;
    private int price;
    private String size;
    private String color;

    public Helmet(String name, double weight, int price, String size, String color) {
        this.name = name;
        this.weight = weight;
        this.price = price;
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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
