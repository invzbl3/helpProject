package com.example.helpproject.controller;

import com.example.helpproject.model.Employee;
import com.example.helpproject.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author invzbl3 on 1/21/2023
 * @project helpProject
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>
                (employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }
}