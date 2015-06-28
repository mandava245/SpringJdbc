package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.EmployeeDao;
import com.springjdbc.dto.Employee;

public class ClientApplication2
{
    public static void main( String[] args )
    {
		
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/config/beanConfig.xml");
        EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
        
        Employee employee = new Employee();
        employee.setEmployeeId(88);
        employee.setEmployeeName("Pavan");
        employee.setSalary(45000);
        
        int count = dao.updateEmployee(employee);
        System.out.println("Employee Updated Successfully :: "+count);
        
    }
}
