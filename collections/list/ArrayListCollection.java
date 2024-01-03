package collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<Fruits> fruitName = new ArrayList<>();
        String anotherFruit = "Watermelon";

        fruitName.add(new Fruits(12,"Bannna","Yellow"));
        fruitName.add(new Fruits(20,"Grapes","Green"));
        fruitName.add(new Fruits(9,"Apple","Red"));

        fruitName.forEach( n -> System.out.println(n));

        Collections.sort(fruitName, new NameComarator());

        System.out.println(fruitName);

    }

}
