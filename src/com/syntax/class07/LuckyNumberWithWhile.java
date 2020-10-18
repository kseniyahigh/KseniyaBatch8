package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberWithWhile {

	public static void main(String[] args) {
		int numberFromUser;
		int luckyNumber=7;
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter any number");
		numberFromUser=input.nextInt();
		
		while (numberFromUser!=luckyNumber) {
			System.out.println("Please enter any number");
			numberFromUser=input.nextInt();
		}
		
System.out.println("You won the lottery");
	}

}
