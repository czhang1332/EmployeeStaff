package com.example.demo;

import com.example.demo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}