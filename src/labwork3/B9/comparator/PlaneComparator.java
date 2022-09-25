package labwork3.B9.comparator;

import labwork3.B9.planes.Plane;

import java.util.Comparator;

public class PlaneComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        if(o1.getFlyingRange() < o2.getFlyingRange())
            return -1;
        else if(o1.getFlyingRange() > o2.getFlyingRange())
            return 0;
        else
            return 1;
    }
}
