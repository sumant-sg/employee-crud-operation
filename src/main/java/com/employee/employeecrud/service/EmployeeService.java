package com.employee.employeecrud.service;

import com.employee.employeecrud.entity.Employee;
import com.employee.employeecrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return repository.saveAll(employees);
    }

    public Employee findEmployeeById(int empId) {
        return repository.findById(empId).orElse(null);
    }


    public List<Employee> findEmployees() {
        return repository.findAll();
    }


    public List<Employee> findByPropertyId(int propertyId) {
        return repository.findByPropertyId(propertyId);
    }
}