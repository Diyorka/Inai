package labwork4.B7.equipment;

public class Jacket implements Equipment {
    private String name;
    private double weight;
    private int price;
    private String season;
    private String size;

    public Jacket(String name, double weight, int price, String season, String size) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.season = season;
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
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
        return "Jacket{" +
                "season='" + season + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
