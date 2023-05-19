package com.ems.emsystem.service.interfaces;

import com.ems.emsystem.entity.Employee;

import java.util.List;

public interface EmployeeService<S> {
    Employee addEmployee(S employee);
    List<S> getAllEmployees();
    Employee findEmployeeById(Long id);
    void deleteEmployee(Long id);
}
