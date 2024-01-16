package com.crud.restdemo.repository;


import com.crud.restdemo.dao.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {
}
