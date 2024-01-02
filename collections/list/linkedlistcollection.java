package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlistcollection {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        String anotherFruit = "Watermelon";

        fruits.add("Bannna");
        fruits.add("Mango");
        fruits.add("apple");

        fruits.forEach( n -> System.out.println(n));

        fruits.remove("Bannna");

        fruits.addFirst("Grapes");
        fruits.addLast("WaterMelon");

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println(fruits);
    }
}
