package com.burakejder.controller.impl;

import com.burakejder.controller.RestEmployeeController;
import com.burakejder.dto.DtoEmployee;
import com.burakejder.model.RootEntity;
import com.burakejder.service.IEmployeeService;
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
public class RestEmployeeContoller extends RestBaseController implements RestEmployeeController {

    private final IEmployeeService employeeService;

    @Override
    @GetMapping(path = "/list/{id}")
    public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
        return ok(employeeService.findEmployeeById(id));
    }
}
