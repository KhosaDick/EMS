package com.ems.emsystem.service.implementation;

import com.ems.emsystem.repository.EmployeeRepo;

public class EmployeeServiceImplBuilder {
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImplBuilder setEmployeeRepo(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
        return this;
    }

    public EmployeeServiceImpl createEmployeeServiceImpl() {
        return new EmployeeServiceImpl(employeeRepo);
    }
}