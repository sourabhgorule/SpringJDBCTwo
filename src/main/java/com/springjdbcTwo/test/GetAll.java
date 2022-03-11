package com.springjdbcTwo.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbcTwo.dao.StudentDao;
import com.springjdbcTwo.bean.*;

public class GetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.config.xml");
		StudentDao dao=context.getBean("dao",StudentDao.class);
		List<Student> students=dao.getAllStudent();
		
		for (Student st : students) {
			System.out.println(st);
		}
		
	}

}
