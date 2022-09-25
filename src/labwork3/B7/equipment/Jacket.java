package labwork3.B7.equipment;

public class Jacket extends Equipment{
    private String season;
    private String size;

    public Jacket(String name, double weight, int price, String season, String size) {
        super(name, weight, price);
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
    public String toString() {
        return "Jacket{" +
                "season='" + season + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
