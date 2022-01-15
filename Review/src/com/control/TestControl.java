package com.control;

//selection logic 	-> conditional flow -> conditional 	-> if, switch

//sequential logic 	-> sequential flow 	-> branching 	-> continue, break, return

//iterative logic 	-> iterative flow 	-> looping 		-> for, while, do while

public class TestControl {
	
	
	//selection Logic -> conditional flow -> conditional
	
	//switch
	
	public enum Dogs{collie, harrier};
	public enum shoes{Nike, Adidas, Puma, Reebok};
	
	public static void main(String[] args) {
	
	shoes a1 = shoes.Reebok;
	
	switch(a1) {
	case Nike :
		System.out.println("Nike, just do it");
		break;
	case Adidas :
		System.out.println("Adidas- Impossible is nothing");
		break;
	case Puma :
		System.out.println("Puma- Forever faster");
		break;
	case Reebok :
		System.out.println("Reebok - I am what I am");
		break;
		
	}
		
		
		
		
		
		
		
	Dogs myDog = Dogs.collie;
	
	switch(myDog) {
	case collie:
	System.out.println("collie");
	case harrier:
		System.out.println("harrier");
		}
	
	String mobile = "iPhone";
	switch(mobile) {
	case "samsung":
		System.out.println("Buy a Samsung phone");
		break;
		
	case "iPhone":
		System.out.println("Buy an iPhone");
		break;
		
	case "Motorola":
		System.out.println("Buy a Motorola phone");
	
		}
	
	
	Integer x = 3;
	
	switch(x) {
	case 1 :
		System.out.println("Value of x = 1");
		break;
	case 2 :
		System.out.println("Value of x = 2");
		break;
	case 3 :
		System.out.println("Value of x = 3");
		break;
		
		//default case statement
	default:
		System.out.println("Value of x is undefined");
		
		
		int brand = 4;
		String name = "Prada";
		
		switch(brand) {
		case 1 :
			name = "Nike";
			break;
		case 2 :
			name = "Dolce &amp; Gabbana";
			break;
		case 3:
			name = "Prada";
			break;
			
		case 4 :
			name = "Lous Vitton";
			break;
		}
		System.out.println("The brand name is: " + name);
		
		
		
		
	
	
	
	
		}
	}
}
