package com.burakejder.service;

import com.burakejder.dto.DtoEmployee;


public interface IEmployeeService {

    public DtoEmployee  findEmployeeById(Long id);
}
