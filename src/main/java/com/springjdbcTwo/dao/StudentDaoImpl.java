package com.springjdbcTwo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbcTwo.bean.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int saveStudent(Student st) {
		
		String sql="insert into student values(?,?,?,?)";
		Object [] params= {st.getRollnumber(),st.getName(),st.getLastname(),st.getPRN()};
		
		int inserted=template.update(sql,params);
		
		return inserted;
	}

	@Override
	public int updateRecord(Student st) {
		String sql="update student set firstname=?, lastname=?,PRN=? where rollnumber=? ";
		Object [] params= {st.getName(),st.getLastname(),st.getPRN(),st.getRollnumber()};

		int updated = template.update(sql,params);
		return updated;
	}

	@Override
	public int deleteRecord(int id) {
		String sql="delete from student where rollnumber="+id;
		int deleted = template.update(sql);
		return deleted;
	}

	@Override
	public List<Student> getAllStudent() {
		
		String sql="select * from student";
		List<Student> st=template.query(sql,new StudentMapper());
		
		return st;
	}
	
	private class StudentMapper implements RowMapper<Student>{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			int rollnumbe=rs.getInt(1);
			String fname=rs.getString(2);
			String lname=rs.getString(3);
			int PRN=rs.getInt(4);
			Student st=new Student(rollnumbe, fname, lname, PRN);
			
			return st;
		}
		
	}

	
}
