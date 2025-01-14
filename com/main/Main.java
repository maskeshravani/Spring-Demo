package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Login;
import com.entity.Register;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Register r = context.getBean("log",Register.class);
		Login l = context.getBean("r", Login.class);
		
		System.out.println(r);
		System.out.println(l);

	}

}
