package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		int time=15;
		
		if (time>12) {//condition is true
			System.out.println("good day");//code executes 1 time
		}
		System.out.println("--------------------While loop-----------------");
		
		//while (time>12) {
		//	System.out.println("good day"); //INFINITE LOOP
			
		while (time>12) {
			System.out.println("good day");//3 times 
			time--;
		
			}
		//I want to print numbers from 1 to 50;
		int num=0;
		
		while(num<=50) {
			System.out.println(num);
			num++;
		}
// i want to print numbers from 10 to 60
		int a=14;
		
		while(a<=60);
		System.out.println(a+" ");
		a++;
		
	
	System.out.println();

	}
}
