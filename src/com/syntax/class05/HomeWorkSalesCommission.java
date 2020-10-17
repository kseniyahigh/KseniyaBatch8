package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkSalesCommission {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
	System.out.println ("What is your sales ammount?");
	double sales;
	double commission=0;
	sales=input.nextDouble();
	
	
	if (sales>10 && sales<100) {
		commission=(sales*10)/100;
	}else if (sales>100 && sales<200) {
		commission=(sales*10)/100;
	}else if(sales>200 && sales<500) {
  	   commission=(sales*10)/100;
		
	}else if(sales>500) {
		commission=(sales*10)/100;
	}
	
	System.out.println(" Your commission is $"+commission);
		
	
	}
}
