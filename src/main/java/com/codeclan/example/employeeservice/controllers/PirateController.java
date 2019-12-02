package com.codeclan.example.employeeservice.controllers;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class PirateController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getSingleEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

}
