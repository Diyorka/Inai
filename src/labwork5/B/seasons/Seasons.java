package labwork5.B.seasons;

public enum Seasons {
    WINTER(0),
    SPRING(15),
    SUMMER(40){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    AUTUMN(12);

    Seasons(double avgTemperature) {
        this.avgTemperature=avgTemperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }

    public double getAvgTemperature(){
        return avgTemperature;
    }

    private double avgTemperature;
}
