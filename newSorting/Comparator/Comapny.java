package newSorting.Comparator;

import com.app.sorting.comparator.IdComparator;
import newSorting.Comparable.Vehicle;

import java.util.ArrayList;
import java.util.Collections;

public class Comapny {

    public static void main(String[] args) {
        ArrayList<Cars> details = new ArrayList<>();

       details.add(new Cars(85,"Supra"));
       details.add(new Cars(41,"LAferarei"));
       details.add(new Cars(5,"Chevron"));


        System.out.println(details);

       Collections.sort(details, new IdCompare());

        System.out.println(details);
    }
}
