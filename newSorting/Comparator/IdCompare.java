package newSorting.Comparator;

import newSorting.Comparable.Vehicle;

import java.util.Comparator;

public class IdCompare implements Comparator<Cars> {

    @Override
    public int compare(Cars c1, Cars c2) {
        return c1.getId() - c2.getId();
    }
}
