package com.springjdbc.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.springjdbc.dto.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int registerEmployee( final Employee employee) {
		
		String sql = "insert into employees(eid,ename,sal) values (?,?,?)";
		int count = jdbcTemplate.update(sql, new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps) throws SQLException {
					ps.setInt(1, employee.getEmployeeId());
					ps.setString(2, employee.getEmployeeName());
					ps.setDouble(3, employee.getSalary());
			}
		});
		return count;
	}
	public int deleteEmployee(final int empId) {
		String sql = "delete from employees where eid in ?";
		int count = jdbcTemplate.update(sql, new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setInt(1, empId);
				
			}
		});
		return count;
	}
	public int updateEmployee(final Employee employee) {
		String sql = "update employees set ename= ?,sal=? where eid=?";
		int i = jdbcTemplate.update(sql, new PreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps) throws SQLException {
				
				ps.setString(1,employee.getEmployeeName());
				ps.setDouble(2, employee.getSalary());
				ps.setInt(3, employee.getEmployeeId());
				
			}
		});
		return i;
	}

}
