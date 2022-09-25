package labwork3.A2;

public class Wheel {
    private String season;
    private double diameter;

    public Wheel(String season, double diameter) {
        this.season = season;
        this.diameter = diameter;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "season='" + season + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
