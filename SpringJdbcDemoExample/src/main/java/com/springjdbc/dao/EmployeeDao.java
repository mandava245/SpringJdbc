package com.springjdbc.dao;

import com.springjdbc.dto.Employee;

public interface EmployeeDao {

	public int registerEmployee(Employee employee);
	
	public int updateEmployee(Employee employee);
	
	public int deleteEmployee(int empId);

}
