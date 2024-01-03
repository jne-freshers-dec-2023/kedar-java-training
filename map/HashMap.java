package map;

import java.util.Map;
import java.util.stream.Collectors;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<Integer,String> countrys = new java.util.HashMap<>();

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


       countrys.remove(1);
       System.out.println("After Removing Key 1 :"+countrys);

        System.out.println("Size of Map : "+countrys.size());

        System.out.println("Values : "+ countrys.values());

        countrys.replace(4,"Brazil");
        System.out.println("After Replacing : "+ countrys);

        countrys.clear();
        System.out.println("HAshMap after clearing");
    }
}
