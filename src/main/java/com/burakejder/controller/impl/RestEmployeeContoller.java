package com.burakejder.controller.impl;

import com.burakejder.controller.RestEmployeeController;
import com.burakejder.dto.DtoEmployee;
import com.burakejder.service.impl.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@AllArgsConstructor
@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeContoller implements RestEmployeeController {

    private final EmployeeServiceImpl employeeService;

    @Override
    @GetMapping(path = "/list/{id}")
    public DtoEmployee findEmployeeById(@PathVariable(value = "id") Long id) {
        return employeeService.findEmployeeById(id);
    }
}
