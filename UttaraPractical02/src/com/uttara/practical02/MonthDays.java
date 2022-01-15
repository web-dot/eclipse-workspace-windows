package com.uttara.practical02;

public class MonthDays {

	public static void main(String[] args) {


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

	}

}
