package com.burakejder.controller;

import com.burakejder.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}
