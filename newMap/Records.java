package newMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Records {

    public static void main(String[] args) {

        HashMap<Integer,String> details = new HashMap<>();

        details.put(1,"Kedar");
        details.put(2,"Dhiraj");
        details.put(3,"Rohit");
        details.put(4,"Parth");

        if(details.containsKey(2)) {
            details.remove(2);
        }

        System.out.println(details);

        }
    }

