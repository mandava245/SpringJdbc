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

}
