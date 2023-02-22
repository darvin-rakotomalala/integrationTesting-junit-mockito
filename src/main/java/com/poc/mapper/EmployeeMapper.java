package com.poc.mapper;

import com.poc.common.DtoMapper;
import com.poc.model.domain.Employee;
import com.poc.model.dto.EmployeeDTO;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper extends DtoMapper<EmployeeDTO, Employee> {

}
