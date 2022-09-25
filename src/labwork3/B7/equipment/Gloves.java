package labwork3.B7.equipment;

public class Gloves extends Equipment{
    private String size;

    public Gloves(String name, double weight, int price, String size) {
        super(name, weight, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Gloves{" +
                "size='" + size + '\'' +
                '}';
    }
}
