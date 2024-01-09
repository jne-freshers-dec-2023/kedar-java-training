package newcollection.list;

import com.app.sorting.comparator.Employee;

import java.util.ArrayList;
import java.util.HashSet;

public class Company {

    public static void main(String[] args) {

        ArrayList<Vehicle> company = new ArrayList<>();

        company.add(new Vehicle(1,"BMW i7","Black"));
        company.add(new Vehicle(2,"BMW X5","Red"));
        company.add(new Vehicle(3,"BMW M5","Grey"));


        for (Vehicle cars : company){
            System.out.println(cars);
        }


    }
}
