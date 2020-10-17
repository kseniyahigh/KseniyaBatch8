package com.syntax.class05;

import java.util.Scanner;

public class EnhahcementTASK3 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println ("Put in your 3 scores");
		int quiz=input.nextInt();
		int midTerm=input.nextInt();
		int finScore=input.nextInt();
		char grade;
		
		int averageScore=(quiz+midTerm+finScore)/3;
		
		if(averageScore>=90) {
			grade='A';
		}else if (averageScore>=70 && averageScore<90) {
			grade='B';
		}else if(averageScore>=50 && averageScore<70) {
			grade='C';
		}else if (averageScore>=40 && averageScore<50)	{
			grade='D';
		}else {
			grade='F';
			
			
		}
		System.out.println(" Grade is = "+grade);
		
		if (grade=='A'|| grade=='B') {
			System.out.println ("You are good student");
			
		}else {
			System.out.println("Please study more");
			
		}
		
		
			
		}
	
	
	

}
