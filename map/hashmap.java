package map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer,String> countrys = new HashMap<>();

        countrys.put(1,"India");
        countrys.put(1,"USA");
        countrys.put(2,"Russia");
        countrys.put(3,"UK");
        countrys.put(4,"Israel");

        Map<Integer,String> resultSet = countrys.entrySet().stream()
                        .filter(entry -> entry.getKey() > 2)
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println(resultSet);
       countrys.forEach((k,v) -> System.out.println("Keys : " + k + " Value : " + v));

    }
}
