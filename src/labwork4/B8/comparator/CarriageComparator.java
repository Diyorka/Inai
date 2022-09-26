package labwork4.B8.comparator;

import labwork4.B8.carriages.Carriage;

import java.util.Comparator;

public class CarriageComparator implements Comparator<Carriage> {

    @Override
    public int compare(Carriage o1, Carriage o2) {
        if(o1.getComfortLevel() < o2.getComfortLevel())
            return -1;
        else if(o1.getComfortLevel() > o2.getComfortLevel())
            return 0;
        else
            return 1;
    }
}
