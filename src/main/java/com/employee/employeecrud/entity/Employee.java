package com.employee.employeecrud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_TBL")
public class Employee {
    @Id
    @GeneratedValue
    private int empId;
    private String empName;
    private int empAge;
    private int propertyId;
    private int userid;

    private String propertyName;



    public Employee(int empId, String empName, int empAge, int propertyId, String propertyName) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.propertyId = propertyId;
        this.propertyName = propertyName;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", propertyId=" + propertyId +
                ", propertyName='" + propertyName + '\'' +
                '}';
    }





}
