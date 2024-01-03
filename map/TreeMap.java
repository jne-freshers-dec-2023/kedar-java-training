package map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {

        java.util.TreeMap<Integer,String> records = new java.util.TreeMap<>();

        records.put(3,"John");
        records.put(2,"Alice");
        records.put(1,"John");
        records.put(5,"Kedar");

        System.out.println(records);

        System.out.println("Value for key 2 : " + records.get(2));

        records.remove(2);
        System.out.println("After removing key 2 : " + records);

        System.out.println("Does 2 exist ? " + records.containsKey(2));

        System.out.println("First Entry : "+ records.firstEntry());

        System.out.println("Last Entry : "+records.lastEntry());

        for (Map.Entry<Integer,String> entry : records.entrySet()){
            System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
        }

    }
}
