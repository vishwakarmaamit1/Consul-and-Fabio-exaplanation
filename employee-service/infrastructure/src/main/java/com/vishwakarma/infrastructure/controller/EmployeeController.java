package com.vishwakarma.infrastructure.controller;

import com.vishwakarma.doman.entities.Employee;
import com.vishwakarma.doman.sevice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService=employeeService;
    }

    @PostMapping(path = "/save")
    public Employee createEmp(@RequestBody Employee employee){
        if(Objects.isNull(employee)){
            throw new  NullPointerException();
        }
        return employeeService.createEmployee(employee);
    }

    @GetMapping(path = "/{id}")
    public Employee getEmp(@PathVariable("id") long id){
        return employeeService.getEmployee(id);
    }

}
