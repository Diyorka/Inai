package labwork5.B.seasons;

public class Main {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SPRING;
        favoriteSeason.getDescription();
        loveSeason(favoriteSeason);
        System.out.println();

        for (Seasons season : Seasons.values()){
            System.out.print(season.name() + ", ");
            System.out.print("Температура: " + season.getAvgTemperature() + ", ");
            System.out.println(season.getDescription());
        }

    }

    public static void loveSeason(Seasons seasons){
        switch (seasons){
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
            case SPRING -> System.out.println("Я люблю весну");
            case WINTER -> System.out.println("Я люблю зиму");
        }
    }
}

