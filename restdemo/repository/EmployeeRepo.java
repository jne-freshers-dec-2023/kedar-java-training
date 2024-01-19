package com.crud.restdemo.repository;


import com.crud.restdemo.dao.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

    public Optional<EmployeeEntity> findByEmail(String email);
}
