package map;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {

        TreeMap<String,String> records = new TreeMap<>();

        records.put("3","John");
        records.put("2","Alice");
        records.put("1","John");
        records.put("5","Kedar");

        System.out.println(records);


    }
}
