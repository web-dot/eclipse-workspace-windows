package com.uttara.device;



class TestDevice{
	
	
	public static void main(String[] args){
		
		/*
		//STEP-02/STEP-04
		Device d = new Device();
		d.name = "Davy";
		d.doSomething();
		
		
		System.out.println();
		
		
		//STEP2/STEP-06
		Device d1 = new TV();
		d1.doSomething();
		System.out.println(d1.name);

		
		System.out.println();
		
		TV t1 = new TV();
		t1.doSomething();
		
		//d.switchChannel();  //CE

		TV t = (TV)d1;
		t.switchChannel(); // WORKS
		*/
		
		
		/*
		//STEP-09
		Device d = new TV();  // Device and TV constuctors executed
		d.doSomething();	//null doing something
		
		d = new Printer(); //Device and Printer constructors executed
		d.doSomething();		//null doing something
		
		
		d = new Microwave(); // Device and Microwave constructors executed
		d.doSomething();	//null doing something
		
		
		System.out.println();
		
		System.out.println("d instance of Microwave? " +  (d instanceof Microwave));  	//true
		System.out.println("d instance of Printer? " +  (d instanceof Printer));		//false
		System.out.println("d instance of TV? " +  (d instanceof TV));					//false
		System.out.println("d instance of Device? " +  (d instanceof Device));			//true
		//System.out.println("d instance of String? " +  (d instanceof String));
		
		
		System.out.println();
		
		d = new TV();
		
		System.out.println("d instance of TV? " +  (d instanceof TV));
		System.out.println("d instance of Device? " +  (d instanceof Device));
		System.out.println("d instance of Microwave? " +  (d instanceof Microwave));
		
		System.out.println();
		
		d = new Printer();
		
		System.out.println("d instance of Microwave? " +  (d instanceof Microwave));
		System.out.println("d instance of TV? " +  (d instanceof TV));
		
		System.out.println("d instance of Printer? " +  (d instanceof Printer));
		System.out.println("d instance of Object? " +  (d instanceof Object));
		System.out.println("d instance of Device? " +  (d instanceof Device));
		*/
		
		
		
		
		//STEP-11
		Electrician e = new Electrician();
		
		//STEP-12
		TV t = new TV();
		t.setName("TV");
		//asking Electrician to test TV
		e.testDevice(t);
	
		System.out.println();
	
		Printer p = new Printer();
		p.setName("Printer");
		//asking Electrician to test Printer
		e.testDevice(p);
		
		System.out.println();
		
		Microwave m = new Microwave();
		m.setName("Microwave");
		//asking Electrician to test Microwave
		e.testDevice(m);
		
		
		
		
		//e.testDevice(null);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}