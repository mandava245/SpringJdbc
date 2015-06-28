package com.springjdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDAO;
import com.springjdbc.dto.Employee;

public class ClientApp3 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config/myBeans.xml");
    	EmployeeDAO employeeDAO = context.getBean("empDao",EmployeeDAO.class);
    	
    	Employee employee = new Employee();
    	employee.setEmployeeId(84);
    	employee.setEmployeeName("Chaitanya");
    	employee.setSalary(55000);
    	
    	int count = employeeDAO.updateEmployee(employee);
    	
    	System.out.println("Employee Updated Successfully :: "+ count);
    	
    }
}
