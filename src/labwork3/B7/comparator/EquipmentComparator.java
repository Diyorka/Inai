package labwork3.B7.comparator;

import labwork3.B7.equipment.Equipment;

import java.util.Comparator;

public class EquipmentComparator implements Comparator<Equipment> {
    @Override
    public int compare(Equipment o1, Equipment o2) {
        if(o1.getWeight() < o2.getWeight())
            return -1;
        else if(o1.getWeight() > o2.getWeight())
            return 0;
        else
            return 1;
    }
}
