package com.syntax.class08;

import java.util.Scanner;

public class LoopTask2 {

	public static void main(String[] args) {
		String item;
		double price,money = 0,enter = 0;
		double notEnough,tooMuch;
		Scanner input=new Scanner (System.in);
		System.out.println ("Which item do you want to buy?");
		item=input.nextLine();
		System.out.println("How much is it?");
		price=input.nextDouble();
		System.out.println("How much money are you entering?");
		enter=input.nextDouble();
		
	    notEnough=price-enter;
	    tooMuch= enter-price; 
		
		
		while (money!=price) {
			if(enter<price) {
				System.out.println(" You should pay extra  "+notEnough+" $ " );
			break;	
				
			}else {
				System.out.println(" You gave me too much. Your change is "+tooMuch+" $ ");
			break;
				
			}
			
		}System.out.println(" Thank your for shopping! ");
		
		
		
		
		
		

	}

}
