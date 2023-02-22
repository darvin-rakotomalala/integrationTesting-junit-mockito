package com.poc.service.business;

import com.poc.model.domain.Employee;

public interface EmployeeCUDSM {
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Long id, Employee updatedEmployee);
    void deleteEmployee(Long id);
}
