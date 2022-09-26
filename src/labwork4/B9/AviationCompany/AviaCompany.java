package labwork4.B9.AviationCompany;

import labwork4.B9.planes.Plane;

import java.util.List;

public class AviaCompany {
    private String name;
    private List<Plane> planeList;

    public AviaCompany(String name, List<Plane> equipmentList) {
        this.name = name;
        this.planeList = equipmentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plane> getAirPlanesList() {
        return planeList;
    }

    public void setAirPlanesList(List<Plane> equipmentList) {
        this.planeList = equipmentList;
    }
    public void addAirPlane(Plane airPlane){

    }

    @Override
    public String toString() {
        return "AviaCompany{" +
                "name='" + name + '\'' +
                ", planeList=" + planeList +
                '}';
    }
}
