package labwork3.A4;

public class State {
    private String name;
    private City capital;
    private int regionCount;
    private double area;
    private City[] cities;
    private Region[] regions;
    private District[] districts;

    public State(String name, City capital, int regionCount, double area, City[] cities, Region[] regions, District[] districts) {
        this.name = name;
        this.capital = capital;
        this.regionCount = regionCount;
        this.area = area;
        this.cities = cities;
        this.regions = regions;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public City getCapital() {
        return capital;
    }

    public int getRegionCount() {
        return regionCount;
    }

    public double getArea() {
        return area;
    }

    public City[] getCities() {
        return cities;
    }

    public Region[] getRegions() {
        return regions;
    }

    public District[] getDistricts() {
        return districts;
    }
}
