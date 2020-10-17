package com.syntax.class03;

public class IfStatement {
	public static void main (String[]args) {
		
		int num1=180;
		int num2=900;
		
		
	//System.out.println("writing my first if statemnt");
		
		if (num1>num2) {//condition ;
			System.out.println("num1 is bigger than num2");
		}
		
		System.out.println("End of if statement");
		
		System.out.println("----------------------");
		int temp=60;
		
		if(temp>=60) {
			System.out.println ("I am going to the beach");
	
		
		}else {
			System.out.println("I will go for a walk");}
		
			
			System.out.println("----------------------");
		
	  double expectedHours=15;
	  double actualHours=20;
	  
	  if (actualHours>expectedHours) {//true
		  System.out.println ("You will love the course and you will succeed");
	  }else {//false
		  System.out.println("Course will be too hard for you");
		  
		  
	  }
	}
}