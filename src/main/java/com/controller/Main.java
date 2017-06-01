package main.java.com.controller;

import main.java.com.model.Employee;
import main.java.com.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by gayathri on 6/1/17.
 */
public class Main {
    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Jhon");
        employee.setSalary(20000.00);

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
        employeeService.saveEmployee(employee);
    }
}

/*    String configFileName = "none";
            configFileName = System.getProperty(ControlWebGlobalConstants.log_configuration, configFileName);
                    org.apache.log4j.PropertyConfigurator.configure(configFileName);
                    ApplicationContext springContext = new ClassPathXmlApplicationContext(ControlWebGlobalConstants.paths);
                    CHDXProcessService chdxProcessService = (CHDXProcessService) springContext.getBean("chdxProcessService");
                    chdxProcessService.saveFile();*/
