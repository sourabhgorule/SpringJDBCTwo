package com.springjdbcTwo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbcTwo.bean.Student;
import com.springjdbcTwo.dao.StudentDao;

public class Update {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.config.xml");
		StudentDao dao = (StudentDao)context.getBean("dao");
		Student s=new Student(1, "sahil", "chougale", 232323);
		
		dao.updateRecord(s);
		
	}
	
}
