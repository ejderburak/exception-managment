package com.burakejder.service.impl;

import com.burakejder.dto.DtoDepartment;
import com.burakejder.dto.DtoEmployee;
import com.burakejder.exception.BaseException;
import com.burakejder.exception.ErrorMessage;
import com.burakejder.exception.MessageType;
import com.burakejder.model.Department;
import com.burakejder.model.Employee;
import com.burakejder.repository.EmployeeRepository;
import com.burakejder.service.IEmployeeService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository; // bean injection


    @Override
    public DtoEmployee findEmployeeById(Long id) {

        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);

        if (optional.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXISTS,id.toString()));
        }

        Employee employee = optional.get();
        Department department = employee.getDepartment();

        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}
