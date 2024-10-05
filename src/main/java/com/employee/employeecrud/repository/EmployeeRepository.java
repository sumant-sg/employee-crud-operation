package com.employee.employeecrud.repository;

import com.employee.employeecrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



    List<Employee> findByPropertyId(int propertyId);
}


