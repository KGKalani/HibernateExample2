package main.java.com.dao.impl;

import main.java.com.dao.EmployeeDao;
import main.java.com.model.Employee;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * Created by gayathri on 6/1/17.
 * Dao file
 */
public class EmployeeDaoImp implements EmployeeDao{

    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public void saveEmployee(Employee employee) {
        hibernateTemplate.save(employee);
    }
}
