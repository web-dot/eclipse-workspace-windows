package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		System.out.println("starting Spring Container");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring Container started");
		
		
		Employee e1 = (Employee)ctx.getBean("emp1");
		Employee e2 = (Employee)ctx.getBean("emp1");
		
		Task t1 = (Task)ctx.getBean("asp");
		e1.completeTask(t1);
		
		
		Task t2 = (Task)ctx.getBean("mco");
		e1.completeTask(t2);
		
	}

}
