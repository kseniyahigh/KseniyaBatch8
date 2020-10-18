package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		////play a lottery where we need to enter from 1 to 100
		//lucky number is 7;
		
//keep asking user to enter number until they enter a lucky number;
		int numberFromUser;
		int luckyNumber=7;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.println ("Please enter any number");
			numberFromUser=input.nextInt();
		}while(numberFromUser!=luckyNumber);
		
		System.out.println("You won the lottery");
		

	}

}
