package com.studMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.Country;
import com.student.Student;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Student s = context.getBean("std",Student.class);
		Country c = context.getBean("c", Country.class);
//		s.setId(2);
//		s.setName("Shravani");
//		s.setAdd("Sangli");
//		
//		System.out.println(s);
//		
//		s.setId(3);
//		s.setName("Abhi");
//		s.setAdd("Pune");
		System.out.println(s);
	}

}
