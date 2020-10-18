package com.syntax.class08;

import java.util.Scanner;

public class RecapWithDoWhile {

	public static void main(String[] args) {
		int money;
		int waterPrice=5;
		Scanner input=new Scanner(System.in);
		
		System.out.println ("Please pay for your water");
		
		
		do {//will let me once;
			money=input.nextInt();
			if(money>waterPrice) {
				System.out.println ("This is too much, you need to give less");
				
			}else if(money>waterPrice) {
				System.out.println ("Water is expensive, plrase insert more money");
				
		}
      
	   }while(money!=waterPrice);
		System.out.println("Enjoy your water");
	}

}
