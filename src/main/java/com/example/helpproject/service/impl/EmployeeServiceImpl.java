package com.example.helpproject.service.impl;

import com.example.helpproject.model.Employee;
import com.example.helpproject.repository.EmployeeRepository;
import com.example.helpproject.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author invzbl3 on 1/21/2023
 * @project helpProject
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        //super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}