


package com.control;

public class TestSwitch {

	public static void main(String[] args) {
			
		/*
			switch(expression) {
			case value1:
				//code
				break;
			case value2:
				//code
				break;
			
			//...
				
			default
				//default statements
			}
		
		
		int number = 48;
		String size;
		//switch statement to check size
		
		switch(number) {
			case 29:
				size = "small";
				break;
			case 42:
				size = "Medium";
				break;
			case 44:
				size = "Large";
				break;
			case 48:
				size = "Extra Large";
				break;
			default:
				size = "unknown";
				break;
		}
		System.out.println("Size: " + size);
		
		
		//
		int expression = 2;
		//switch statement to check size
		switch(expression) {
		case 1:
			System.out.println("Case 1");
		case 2:
			System.out.println("Case 2");
		case 3:
			System.out.println("Case 3");
		default :
			System.out.println("Default case");
			}	
	
		
		int epresssion = 9;
		switch(expression) {
			case 2: 
				System.out.println("small size");
				break;
			case 3:
				System.out.println("Large size");
				break;
			default:
				System.out.println("Unknown Size");
		}
		
		String grade = "A";
		switch(grade) {
			case "A+" :
				System.out.println("Highest honors");
				break;
			case "A" :
				
			case "A-" :
				System.out.println("Honors");
				break;
			case "B+" :
			case "B" :
				System.out.println("Favourable Mention");
				break;
		}
		
		*/
		
		
		
		
		/*
		int x = 2;
		int y = 20;
		int a;
		switch(x) {
		case 0 :
			a = x * y;
			System.out.println(a);
			break;
		case 1 :
			a = x * y;
			System.out.println(a);
			break;
		case 2 :
			a = x * y;
			System.out.println(a);
			break;
		default :
			System.out.println("default");
			break;
		}
		*/
		
		
		
		String month = "feb";
		int days;
		int year = 2016;
		switch(month) {
		case "jan" :
		case "mar" :
		case "may" :
		case "july":
		case "aug" :
		case "oct" :
				days = 31;
				System.out.println(days);
				break;
		case "april":
		case "june" :
		case "sep" 	:
		case "nov" 	:
				days = 30;
				System.out.println(days);
				break;
		case "feb" :
				if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
					days = 29;
				}
				else {
					days = 28;
				}
				System.out.println(days);
				
				
		}
				
		/*		
		int ndays = switch(month) {
	    case JAN, MAR, MAY, JUL, AUG, OCT, DEC -> 31;
	    case APR, JUN, SEP, NOV -> 30;
	    case FEB -> {
	        if(year % 400 ==0) yield 29;
	        else if(year % 100 == 0) yield 28;
	        else if(year % 4 ==0) yield 29;
	        else yield 28; }
	        */
		do {
			System.out.println("jj");
		}while(true); 
			System.out.println("yy");
			
		
		

				
				
				
				
		}
		
	}




