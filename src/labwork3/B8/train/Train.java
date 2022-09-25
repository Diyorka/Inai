package labwork3.B8.train;

import labwork3.B8.carriages.Carriage;

import java.util.List;

public class Train {
    private String name;
    private List<Carriage> carriageList;

    public Train(String name, List<Carriage> carriageList) {
        this.name = name;
        this.carriageList = carriageList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Carriage> getCarriageList() {
        return carriageList;
    }

    public void setCarriageList(List<Carriage> carriageList) {
        this.carriageList = carriageList;
    }

    @Override
    public String toString() {
        return "Train{" +
                "name='" + name + '\'' +
                ", carriageList=" + carriageList +
                '}';
    }
}
