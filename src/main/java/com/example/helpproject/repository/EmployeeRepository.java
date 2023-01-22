package com.example.helpproject.repository;

import com.example.helpproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author invzbl3 on 1/21/2023
 * @project helpProject
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}