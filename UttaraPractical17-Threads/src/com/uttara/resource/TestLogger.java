package com.uttara.resource;

public class TestLogger {

	public static void main(String[] args) {
		
		Logger l1 = Logger.getInstance();//new Logger();
		Logger l2 = Logger.getInstance();
		
		System.out.println("is l1==l2 ? "+(l1==l2));

		l1.log("this is a sample log");
		l1.log("main()->going to invoke process()...");
		process();
		l1.log("main()->after process()...");
		l1.log("main()->ending...");
	}

	public static void process() {
		
		Logger logger = Logger.getInstance();
		logger.log("process()->starting...");
		logger.log("process()->doing something...");
		logger.log("process()->ending...");
	}

}
