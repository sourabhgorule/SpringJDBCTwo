package com.springjdbcTwo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbcTwo.dao.StudentDao;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.config.xml");
		StudentDao  dao= context.getBean("dao",StudentDao.class);
		
		int i=1;
		dao.deleteRecord(i);
	
		
	}

}
