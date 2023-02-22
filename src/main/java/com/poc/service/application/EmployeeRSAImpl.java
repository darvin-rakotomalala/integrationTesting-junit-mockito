package com.poc.service.application;

import com.poc.mapper.EmployeeMapper;
import com.poc.model.dto.EmployeeDTO;
import com.poc.service.business.EmployeeRSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeRSAImpl implements EmployeeRSA {

    private final EmployeeRSM employeeRSM;

    private final EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeMapper.toDTO(employeeRSM.getAllEmployees());
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        return employeeMapper.toDTO(employeeRSM.getEmployeeById(id).get());
    }

}
