package com.vishwakarma.config;

import com.vishwakarma.doman.sevice.EmployeeService;
import com.vishwakarma.infrastructure.feign.AddressProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public EmployeeService employeeService(AddressProvider addressProvider){
        return new EmployeeService(addressProvider);
    }
}
