package com.springwithhibernate.poc.repository;

import com.springwithhibernate.poc.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, String> {
}
