package com.app.sorting.comaparable;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {

        ArrayList<Employee> empDetails = new ArrayList<>();

        empDetails.add(new Employee(24,"Kedar","9503693840"));
        empDetails.add(new Employee(68,"Tushar","8547601496"));
        empDetails.add(new Employee(7,"Dhiraj","7854219635"));

        System.out.println(empDetails);
        Collections.sort(empDetails);

        System.out.println(empDetails);
    }
}
