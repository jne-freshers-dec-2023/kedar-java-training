package collections.queue;

import java.util.ArrayDeque;

public class ArrayQueueCollection {
    public static void main(String[] args) {

        ArrayDeque<String> colors = new ArrayDeque<>();

        colors.offerFirst("Red");
        colors.offerFirst("Yellow");
        colors.offerFirst("Orange");
        colors.offerFirst("Black");

      colors.pollFirst();

        String newColor = "Black";

        if(colors.contains(newColor)){
            colors.forEach( elements -> System.out.println(elements));
        }
        else {
            System.out.println("Black is not present");
        }
    }
}
