package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// ask user to pay for water
		//water price is 5
		//once user enters money then we tell if we need more money or less
		//once we get exactly 5 then------>enjoy your water 
		int money;
		int waterPrice=5;
		Scanner input=new Scanner(System.in);
		
		System.out.println ("Please pay for your water");
		money=input.nextInt();
		
		while (money!=waterPrice) {
			if(money>waterPrice) {
				System.out.println ("This is too much, you need to give less");
				
			}else {
				System.out.println ("Water is expensive, plrase insert more money");
				
			}
			money=input.nextInt();
		}
		System.out.println("Enjoy your water");

	}

}
