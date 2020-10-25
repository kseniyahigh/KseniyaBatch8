package com.syntax.class08;

public class TaskLoops {

	public static void main(String[] args) {
		
		int sumE=0;
		int sumO=0;
		
		for (int a=1;a<=50;a++) {
			if(a%2==0) {
				sumE=a+sumE;
			}else {
				sumO+=a;
			}
			System.out.println (" The sum of even numbers from 1 to 50 is "+ sumE);
			System.out.println(" The sum of even numbers from 1 to 50 is "+sumO);
			
			System.out.println("------------------------------------");
			//i want to craete a multiplication table;
			
			
			int num1=7;
			int mult;
			
			for(int i=1; i<=10;i++) {
				
				mult=num1*i;
				System.out.println(num1+" x "+i+" = "+mult);
				
			}
			
		}

	}

}
