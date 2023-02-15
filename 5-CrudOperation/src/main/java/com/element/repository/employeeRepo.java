package com.element.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.entity.Employee;

@Repository
public interface employeeRepo extends JpaRepository<Employee, Integer> {

}
