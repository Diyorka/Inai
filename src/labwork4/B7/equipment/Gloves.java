package labwork4.B7.equipment;

public class Gloves implements Equipment {
    private String name;
    private double weight;
    private int price;
    private String size;

    public Gloves(String name, double weight, int price, String size) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Gloves{" +
                "size='" + size + '\'' +
                '}';
    }
}
