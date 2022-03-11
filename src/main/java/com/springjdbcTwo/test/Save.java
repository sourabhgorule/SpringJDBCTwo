package com.springjdbcTwo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbcTwo.bean.Student;
import com.springjdbcTwo.dao.StudentDao;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.config.xml");
		
		StudentDao dao=context.getBean("dao",StudentDao.class);
		
		Student st=new Student(1, "Sourabh", "chavan", 202333);
		
		dao.saveStudent(st);
		
	}

}
