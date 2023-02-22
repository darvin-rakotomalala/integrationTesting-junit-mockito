package com.poc.service.application;

import com.poc.model.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeRSA {
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeById(Long id);
}
