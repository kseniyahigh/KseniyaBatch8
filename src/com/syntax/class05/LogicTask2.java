package com.syntax.class05;

import java.util.Scanner;

public class LogicTask2 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println ("Put in your 3 scores");
		int quiz=input.nextInt();
		int midTerm=input.nextInt();
		int finScore=input.nextInt();
		
		int averageScore=(quiz+midTerm+finScore)/3;
		
		if (averageScore>=90) {
			System.out.println("Your grade is A");
			System.out.println("You are good student");
		}else if (averageScore>=70 && averageScore<90){
			System.out.println("Your grade is B");
		}else if (averageScore>=50 && averageScore<70) {
			System.out.println("Your grade is C");
			
			
		}else if (averageScore>=40 && averageScore<50) {
			System.out.println("Your grade is D");
			System.out.println ("Please study more");
		}else {
			System.out.println ("Your grade is F");
			
		}
		// if your grade is A or B ======> you are good student, you are studying a lot
		//
	}

}
