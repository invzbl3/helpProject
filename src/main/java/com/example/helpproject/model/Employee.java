package com.example.helpproject.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author invzbl3 on 1/21/2023
 * @project helpProject
 */
@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String email;
}