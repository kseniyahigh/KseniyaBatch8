package com.syntax.class05;

import java.util.Scanner;

public class HW {
	public static void main (String[]args) {
		
		boolean answer;
		double balance;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false");
		
		answer=input.nextBoolean();
		
		if(answer) {
			System.out.println("What is balance on your card?");
			balance=input.nextDouble();
		    if(balance>1000) {
		    	System.out.println ("Please pay off your card balance");
		    }else {
		    	System.out.println ("You can spend more money");
		    }
		}else {
			System.out.println ("Would you like to get a credit card?");
		}
		
	}

}
