package collections.queue;

import java.util.PriorityQueue;

public class PriorityCollection {
    public static void main(String[] args) {

        PriorityQueue<Integer> numberSet = new PriorityQueue<>();

        numberSet.offer(78);
        numberSet.offer(25);
        numberSet.offer(8);
        numberSet.offer(37);

        System.out.println(numberSet.remove(8));

        for (Integer elememts : numberSet){
            System.out.println(elememts);
        }

    }
}
