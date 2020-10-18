package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		// Ask user what is his name 5 times--> print hello+name
		
	Scanner input=new Scanner(System.in);
	int number=1;
	while(number <=5) {
	System.out.println("Please tell me your name");
	String name=input.nextLine();
    System.out.println("Nice to meet you "+name);
    number++;
    
	}
	System.out.println("-------------------------");
	//play a lottery where we need to enter from 1 to 100
	//lucky number is 7;
	 //keep asking user to enter number until they enter a lucky number;
	

	
	}
}
