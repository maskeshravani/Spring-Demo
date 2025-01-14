package com.entitites;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Register1 r = context.getBean("log",Register1.class);
		Login1 l = context.getBean("R", Login1.class);
		
		System.out.println(r);
		System.out.println(l);
	}

}
