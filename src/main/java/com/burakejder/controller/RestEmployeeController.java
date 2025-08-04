package com.burakejder.controller;

import com.burakejder.dto.DtoEmployee;
import com.burakejder.model.RootEntity;
import com.burakejder.service.impl.EmployeeServiceImpl;

public interface RestEmployeeController {

    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
