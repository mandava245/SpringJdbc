package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dto.Employee;

public class ClientApplication3
{
    public static void main( String[] args )
    {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config/beanConfig.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
        
        int count =  dao.deleteEmployee(84);
        System.out.println("Employee Deleted Successfully :: "+count);
      
    }
}
