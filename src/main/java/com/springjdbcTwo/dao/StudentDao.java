package com.springjdbcTwo.dao;

import java.util.List;

import com.springjdbcTwo.bean.Student;

public interface StudentDao  {
	
	public int saveStudent(Student st);
	
	public int updateRecord(Student st) ;
	
	public int deleteRecord(int id);
	
	public List<Student> getAllStudent();
	
		
	

}
