package com.poc.service.application;

import com.poc.model.dto.EmployeeDTO;

public interface EmployeeCUDSA {
    EmployeeDTO saveEmployee(EmployeeDTO employee);
    EmployeeDTO updateEmployee(Long id, EmployeeDTO employee);
    void deleteEmployee(Long id);
}
