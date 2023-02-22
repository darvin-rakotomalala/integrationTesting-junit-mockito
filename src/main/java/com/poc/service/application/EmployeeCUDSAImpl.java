package com.poc.service.application;

import com.poc.mapper.EmployeeMapper;
import com.poc.model.dto.EmployeeDTO;
import com.poc.service.business.EmployeeCUDSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmployeeCUDSAImpl implements EmployeeCUDSA {

    private final EmployeeCUDSM employeeCUDSM;

    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employee) {
        return employeeMapper.toDTO(employeeCUDSM.saveEmployee(employeeMapper.toDO(employee)));
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO employee) {
        return employeeMapper.toDTO(employeeCUDSM.updateEmployee(id, employeeMapper.toDO(employee)));
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeCUDSM.deleteEmployee(id);
    }

}
