package labwork9.task9;

public class Car implements Comparable<Car>{
    private String brandName;
    private String model;
    private int releaseYear;

    public Car(String brandName, String model, int releaseYear) {
        this.brandName = brandName;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public int compareTo(Car o) {
        if (this.releaseYear == o.getReleaseYear()) {
            return 0;
        } else if (this.releaseYear < o.getReleaseYear()) {
            return -1;
        } else {
            return 1;
        }
    }
}
