package com.springjdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int registerEmployee(Employee employee) {

		int eid = employee.getEmployeeId();
		String ename = employee.getEmployeeName();
		double sal = employee.getSalary();
		String sql = "insert into employees values (" + eid + ",'" + ename
				+ "'," + sal + ")";
		int count = jdbcTemplate.update(sql);

		return count;
	}

	public int updateEmployee(Employee employee) {
		
		String sql = "update employees set ename=?,sal=? where eid=?";
		int count = jdbcTemplate.update(sql, employee.getEmployeeName(),employee.getSalary(),employee.getEmployeeId());
		return count;
		
	}

	public int deleteEmployee(int empId) {
		String sql = "delete from employees where eid in ?";
		int i = jdbcTemplate.update(sql, empId);
		return i;
	}
	

	}
