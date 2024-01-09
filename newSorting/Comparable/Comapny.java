package newSorting.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comapny {

    public static void main(String[] args) {
        ArrayList<Vehicle> details = new ArrayList<>();

        details.add(new Vehicle(84,"XUV700"));
        details.add(new Vehicle(28,"Benz"));
        details.add(new Vehicle(2,"Harrier"));

        System.out.println(details);

        Collections.sort(details);

        System.out.println(details);
    }
}
