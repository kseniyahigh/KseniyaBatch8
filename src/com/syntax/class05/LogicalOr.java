package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		String day ="Sunday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today i have Java class at Syntax");
		}

	System.out.println("The End");
	
	/* if day is 1 or 5=====> I am off from Syntax
	 * if day 2 or 3======> GIT class
	 * if day is 4=====> Review Class;
	 * if day 6 or 7======> Java class ;
	 * everything else willl be invalid day
	 */
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter todays day using numbers only");
	 
	int today=input.nextInt();
	
	if (today==1 ||today==5) {//executes only one statement;
		System.out.println ("I am off from Syntax");
		
	}else if (today==2 || today==3) {
		System.out.println ("Today is GIT class");
	}else if(today==4) {
		System.out.println("Today is review class");
	}else if (today==6 ||today==7) {
		System.out.println("Today is Java class");
	}else {
		System.out.println("Please enter a valid day from 1 to 7");
	}
	
}
}
