package com.example.EmployeeManagmentSystem.Repository;

import com.example.EmployeeManagmentSystem.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom queries if needed
}
