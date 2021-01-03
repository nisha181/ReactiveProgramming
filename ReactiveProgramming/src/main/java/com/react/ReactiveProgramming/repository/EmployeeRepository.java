package com.react.ReactiveProgramming.repository;


import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import com.react.ReactiveProgramming.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends R2dbcRepository<EmployeeModel, Integer> {

}
