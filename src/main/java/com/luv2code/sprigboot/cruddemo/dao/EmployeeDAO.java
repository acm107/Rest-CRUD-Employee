package com.luv2code.sprigboot.cruddemo.dao;

import com.luv2code.sprigboot.cruddemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
