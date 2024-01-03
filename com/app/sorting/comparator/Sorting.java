package com.app.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {

        ArrayList<Employee> empDetails = new ArrayList<>();

        empDetails.add(new Employee(24,"Zara","9503693840"));
        empDetails.add(new Employee(68,"Abhi","8547601496"));
        empDetails.add(new Employee(7,"Dhiraj","7854219635"));

        System.out.println(empDetails);
        Collections.sort(empDetails, new IdComparator());
        System.out.println(empDetails);

        ArrayList<Employee> anotherEmployeeDetails = new ArrayList<>(empDetails);

        Collections.sort(anotherEmployeeDetails,new NameComparator());

        System.out.println(anotherEmployeeDetails);


    }
}
