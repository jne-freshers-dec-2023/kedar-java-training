package com.app.sorting.comaparable;

public class Employee implements Comparable<Employee>{


    @Override
    public int compareTo(Employee Emp) {
        return this.empId - Emp.empId;
    }


    private int empId;
    private String name;
    private String phoneNumber;

    public Employee(int empId, String name, String phoneNumber) {
        this.empId = empId;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
