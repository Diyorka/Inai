package labwork3.B7.model;

import labwork3.B7.equipment.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Motorcyclist {
    private String name;
    private List<Equipment> equipmentList = new ArrayList<>();

    public Motorcyclist(String name, List<Equipment> equipmentList) {
        this.name = name;
        this.equipmentList = equipmentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @Override
    public String toString() {
        return "Motorcyclist{" +
                "name='" + name + '\'' +
                ", equipmentList=" + equipmentList +
                '}';
    }
}
