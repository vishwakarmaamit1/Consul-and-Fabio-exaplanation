package com.vishwakarma.doman.sevice;

import com.vishwakarma.doman.BaseAddressProvider;
import com.vishwakarma.doman.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Service
public class EmployeeService {

    private Map<Long,Employee>employeeMap=new HashMap<>();

    private final BaseAddressProvider addressProvider;

    public EmployeeService(BaseAddressProvider addressProvider){
        this.addressProvider=addressProvider;
    }

    public Employee createEmployee(Employee employee){
        employee.setAddress(addressProvider.getAddress(11));
        Employee employee1 = employeeMap.put(employee.getId(), employee);

        return employee1;
    }

    public Employee getEmployee(long id){
        return employeeMap.get(id);
    }
}
