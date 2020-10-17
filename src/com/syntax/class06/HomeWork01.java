package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
    String message;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your grade");
	String grade=input.next();
	switch (grade){
	case "A":
		message="-Excellent";
		break;
	case "B":
		message="-Good";
		break;
	case "C":
		message="-Average";
		break;
	case "D":
		message="-Bad";
		break;
	default:
		message="Not acceptable";
		
		
		
		
		
	}
System.out.println(grade+message);
	}

}
