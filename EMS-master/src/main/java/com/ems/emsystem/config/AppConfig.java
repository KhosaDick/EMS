package com.ems.emsystem.config;

import com.ems.emsystem.repository.EmployeeRepo;
import com.ems.emsystem.service.implementation.EmployeeRepoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmployeeRepo employeeRepo() {
        // Return the implementation of the EmployeeRepo interface
        return new EmployeeRepoImpl();
    }

    // Other bean definitions or configuration methods
    // ...
}
