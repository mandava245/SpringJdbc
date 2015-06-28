package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dto.Employee;

public class ClientApplication1
{
    public static void main( String[] args )
    {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config/beanConfig.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
        
        Employee employee = new Employee();
        employee.setEmployeeId(88);
        employee.setEmployeeName("Pavan");
        employee.setSalary(65000);
        
        int count = dao.registerEmployee(employee);
        System.out.println("Employee Registered : "+count);
        
    }
}
