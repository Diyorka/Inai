package labwork4.B7.equipment;

public class Pants implements Equipment {
    private String name;
    private double weight;
    private int price;
    private String size;
    private String season;

    public Pants(String name, double weight, int price, String size, String season) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.size = size;
        this.season = season;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
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
        return "Pants{" +
                "size='" + size + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
