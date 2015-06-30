package com.springjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementSetter;

import com.springjdbc.dto.Employee;

public class MyPreparedStatementSetter implements PreparedStatementSetter {

	private Employee employee;

	public MyPreparedStatementSetter(Employee employee) {
		super();
		this.employee = employee;
	}

	public void setValues(PreparedStatement ps) throws SQLException {

		ps.setInt(1, employee.getEmployeeId());
		ps.setString(2, employee.getEmployeeName());
		ps.setDouble(3, employee.getSalary());

	}

}
