package com.crud.restdemo.serive;

import com.crud.restdemo.dao.EmployeeEntity;
import com.crud.restdemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomEmployeeDetails implements UserDetailsService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        return employeeRepo.findByEmail(username).orElseThrow(() -> new RuntimeException("Employee Not Found"));
    }
}
