package com.crud.restdemo.serive;


import com.crud.restdemo.dao.EmployeeEntity;


import java.util.List;


public interface EmployeeService {


    public List<EmployeeEntity> getAllEmployee();

    public EmployeeEntity getEmployeeByID(int id);

    public EmployeeEntity createEmployee(EmployeeEntity employee);

    public String updateEmployee(EmployeeEntity employee);

    public String deleteEmployee(int id);


}
