package com.springjdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDAO;

public class ClientApp2 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config/myBeans.xml");
    	EmployeeDAO employeeDAO = context.getBean("empDao",EmployeeDAO.class);
    	
    	int count = employeeDAO.deleteEmployee(63);
    	
    	System.out.println("Employee Deleted Successfully :: "+ count);
    	
    }
}
