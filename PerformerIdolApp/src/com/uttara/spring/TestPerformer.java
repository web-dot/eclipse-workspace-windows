package com.uttara.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformer {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("main() -> starting...");
		
		//start the container
		System.out.println("main() -> starting spring container...");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("main() -> started spring container...");
		
		//ask container to give beans
		
		Performer p1 = (Performer)ctx.getBean("ramu");
		p1.perform();
		
		Performer p2 = (Performer)ctx.getBean("somu");
		p2.perform();
		
		Performer p3 = (Performer)ctx.getBean("mamu");
		p3.perform();
		
		
		
		Performer p4 = (Performer)ctx.getBean("bheemu");
		p4.perform();
		
		/*
		Performer px = (Performer)ctx.getBean("ramu");
		System.out.println("p1 == px :" + (p1 == px));
		*/
		
		System.out.println("main() -> ending...");
	}
}
