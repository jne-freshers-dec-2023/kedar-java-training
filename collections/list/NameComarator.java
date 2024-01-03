package collections.list;

import java.util.Comparator;

public class NameComarator implements Comparator<Fruits> {


    @Override
    public int compare(Fruits fruitsObject1, Fruits fruitsObject2) {
        return fruitsObject1.getName().compareTo(fruitsObject2.getName());
    }
}
