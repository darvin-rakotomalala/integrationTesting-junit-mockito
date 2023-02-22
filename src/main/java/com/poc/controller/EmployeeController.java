package com.poc.controller;

import com.poc.model.dto.EmployeeDTO;
import com.poc.service.application.EmployeeCUDSA;
import com.poc.service.application.EmployeeRSA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeCUDSA employeeCUDSA;
    private final EmployeeRSA employeeRSA;

    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeCUDSA.saveEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRSA.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long id) {
        return employeeRSA.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable("id") Long id, @RequestBody EmployeeDTO employeeDTO) {
        return employeeCUDSA.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeCUDSA.deleteEmployee(id);
        return "Employee deleted successfully !";
    }

}
