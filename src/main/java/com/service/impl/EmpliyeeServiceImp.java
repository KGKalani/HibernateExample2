package main.java.com.service.impl;

import main.java.com.dao.EmployeeDao;
import main.java.com.model.Employee;
import main.java.com.service.EmployeeService;

/**
 * Created by gayathri on 6/1/17.
 */
public class EmpliyeeServiceImp implements EmployeeService {

    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override

    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }
}
