package com.crud.restdemo.controller;


import com.crud.restdemo.dao.EmployeeEntity;
import com.crud.restdemo.serive.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;

//    public EmployeeController(EmployeeServiceImpl employeeService) {
//        this.employeeService = employeeService;
//    }

    @GetMapping("{employeeId}")
    public EmployeeEntity getEmployeeDetails(@PathVariable("employeeId") int id){
           return employeeService.getEmployeeByID(id);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public String createNewEmployee(@RequestBody EmployeeEntity employee){
        employeeService.createEmployee(employee);
        return "Employee Added, Done";
    }

    @PutMapping
    public String updateExistingEmployee(@RequestBody EmployeeEntity employee){
        employeeService.updateEmployee(employee);
        return "Employee Updated, Done";
    }

    @DeleteMapping("{employeeId}")
    public String deleteEmployee(@PathVariable("employeeId") int id){
        employeeService.deleteEmployee(id);
        return "Employee Deleted, Done";
    }
}
