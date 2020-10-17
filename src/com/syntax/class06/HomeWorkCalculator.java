package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkCalculator {

	public static void main(String[] args) {
	int results = 0;
	char operation=0;
	Scanner input=new Scanner (System.in);
	System.out.println("Please enter 2 numbers");
	int num1=input.nextInt();
	int num2=input.nextInt();
	System.out.println("Please enter any of the operators +,-,*,/");
	char operator=input.next().charAt(0);
	
	switch(operator) {
	case '+':
	results=num1+num2;
	break;
	case '-':
	results=num1-num2;
	break;
	case '*':
	results=num1*num2;
	break;
	case '/':
	results=num1/num2;
	break;
	default:
	System.out.println("Invalid operation");
	
	
	}
	System.out.println(results);
	
	if (operation=='+') {
		System.out.println(num1+num2);
	}else if(operation=='-') {
		System.out.println(num1-num2);
	}else if(operation=='*') {
		System.out.println(num1*num2);
	}else if(operation==num1/num2) {
		System.out.println(num1/num2);
		
	}else {
		System.out.println("Please enter valid operator");
	}
	
	}
}
