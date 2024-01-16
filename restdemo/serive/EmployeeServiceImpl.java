package com.crud.restdemo.serive;


import com.crud.restdemo.dao.EmployeeEntity;
import com.crud.restdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity getEmployeeByID(int id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(id);
        if (employeeEntity.isPresent()) {
            return employeeEntity.get();
        }


    }

    @Override
    public String createEmployee(EmployeeEntity employee) {
        employeeRepo.save(employee);
        return "Successfully Added";
    }

    @Override
    public String updateEmployee(EmployeeEntity employee) {
        employeeRepo.save(employee);
        return "Successfully Updated";
    }

    @Override
    public String deleteEmployee(int id) {
        employeeRepo.deleteById(id);
        return "Successfully Deleted";
    }
}
