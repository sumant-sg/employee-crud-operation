package com.employee.employeecrud.controller;

import com.employee.employeecrud.entity.Employee;
import com.employee.employeecrud.repository.EmployeeRepository;
import com.employee.employeecrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee emp) {

        return service.saveEmployee(emp);
    }
    @PostMapping("/addemps")
    public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
        return service.saveEmployees(employees);
    }
    @GetMapping("/employee/{empId}")
    public Employee findAllemployee(@PathVariable int empId) {
        return service.findEmployeeById(empId);
    }

    @GetMapping("/employees")
    public List<Employee> findAllemployees() {
        return service.findEmployees();
    }
    @GetMapping("/employees/property/{propertyId}")
    public ResponseEntity<List<Employee>> getBypropertyId(@PathVariable int propertyId){
        List<Employee> employees = service.findByPropertyId(propertyId);
        return new ResponseEntity<>(employees, HttpStatus.OK);

    }

//    @GetMapping("/employees/property/{propertyId}")
//    public ResponseEntity<List<Employee>> findemployeeByPropertyId(@PathVariable int propertyId) {
//        //List<Employee> employees = service.findByPropertyId(propertyId);
//        return (ResponseEntity<List<Employee>>) service.findByPropertyId(propertyId);
//    The return type of the @GetMapping method in your controller is not correct.
//    The issue lies in casting the result of service.findByPropertyId(propertyId)
//    to ResponseEntity<List<Employee>>. This cast is likely incorrect
//    because service.findByPropertyId(propertyId) probably returns a List<Employee>,
//    not a ResponseEntity.











}




