package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkLoanSpecialist {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println ("What is the amount of loan needed?");
		int amount=input.nextInt();
		
		if (amount<=200000) {
			System.out.println("I will lend the money");
			
		}else {
			System.out.println ("I will reject the client");
		}
		
		
		

		
		
	}

}
