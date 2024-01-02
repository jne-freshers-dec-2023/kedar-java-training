package collections.list;

import java.util.ArrayList;

public class arraylistcollection {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        String anotherFruit = "Watermelon";

        fruits.add("Bannna");
        fruits.add("Mango");
        fruits.add("apple");

        fruits.forEach( n -> System.out.println(n));

        fruits.remove("Bannna");

        System.out.println(fruits);



    }

}
