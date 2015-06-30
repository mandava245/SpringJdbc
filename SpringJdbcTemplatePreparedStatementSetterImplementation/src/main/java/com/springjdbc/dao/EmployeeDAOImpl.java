package com.springjdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.dto.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int registerEmployee(Employee employee) {
		
		String sql = "insert into employees(eid,ename,sal) values (?,?,?)";
		
		MyPreparedStatementSetter myPreparedStatementSetter= new MyPreparedStatementSetter(employee);
		
		int count = jdbcTemplate.update(sql, myPreparedStatementSetter);
		
		return count;
	}
	
}
