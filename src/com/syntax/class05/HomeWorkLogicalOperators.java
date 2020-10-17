package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkLogicalOperators {
// TASK WITH LOGICAL OPERATORS IMPROVED WAY
	public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	
	double num1,num2,num3,largestnum;
	
	System.out.println("Provide 3 double values");
	num1=input.nextDouble();
	num2=input.nextDouble();
	num3=input.nextDouble();
		
	if (num1>num2 && num1>num3) {
		largestnum=num1;
	}else if (num2>num1 && num2>num3){
		largestnum=num2;
		
	}else {
		largestnum=num3;
	}
		
		System.out.println(" The largest number is "+largestnum);
		
	}	
}
