package collections.set;

import java.util.HashSet;

public class HashsetCollections {
    public static void main(String[] args) {

        HashSet<Integer> numberSet = new HashSet<>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);
        numberSet.add(4);

        numberSet.forEach( uniqueNumbers -> System.out.println(uniqueNumbers));

        numberSet.remove(3);

        for(Integer elements : numberSet){
            System.out.println(elements);
        }

        System.out.println(numberSet);

    }
}
