package labwork3.B7.equipment;

public class Pants extends Equipment{
    private String size;
    private String season;

    public Pants(String name, double weight, int price, String size, String season) {
        super(name, weight, price);
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
    public String toString() {
        return "Pants{" +
                "size='" + size + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
