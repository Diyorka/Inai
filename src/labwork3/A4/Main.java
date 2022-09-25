package labwork3.A4;

public class Main {
    public static void main(String[] args) {
        District district = new District("Sverdlovskiy");
        District[] districts = {district};

        Region region = new Region("Chuy");
        Region region1 = new Region("Oshskaya");
        Region region2 = new Region("Issyk-Kolskaya");
        Region region3 = new Region("Djalal-Abadskaya");
        Region[] regions = {region,region1,region2,region3};

        City city = new City("Bishkek", 120);
        City city1 = new City("Naryn", 100);
        City city2 = new City("Karakol", 90);
        City city3 = new City("Djalal-Abad", 110);
        City city4 = new City("Talas", 80);
        City[] cities = {city, city1, city2,city3,city4};

        State state = new State("Kyrgyzstan", city, 7,
                                199900, cities, regions, districts);

        System.out.println(state.getCapital().getName());
        System.out.println(state.getArea());
        System.out.println(state.getRegionCount());
        for (Region reg : state.getRegions()) {
            System.out.println(reg.getName());
        }
    }
}
