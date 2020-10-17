package com.syntax.class06;

import java.util.Scanner;

public class Exercise1{


	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Is there a sale?");
	boolean sale=input.nextBoolean() ;
    double finalPrice,price,discount;
    
		 
		 
		 if(!sale){
			 System.out.println("No shopping");
			 
		 }else {
			 System.out.println ("Please enter the price");
		     price =input.nextDouble();
		 
		  
		 
			 if(price>=10 && price<50) {
				 discount=price * 0.1;
			 }else if(price>=50 && price<100){
				 discount=price * 0.2;
			 }else if(price>=100 && price<500){
				 discount=price * 0.4;
				  
			 }else if (price>=500) {
				 discount=price * 0.5;
				
			 }else {
				 discount=0;
			 }
		
			 finalPrice=price-discount;
			 
System.out.println(" Your producy price is $ "+price+" and you get $ "+discount+" discount "+" and you only pay "+finalPrice);
	}
	}
}
