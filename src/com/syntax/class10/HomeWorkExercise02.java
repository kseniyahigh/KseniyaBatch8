package com.syntax.class10;

import java.util.Scanner;

public class HomeWorkExercise02 {

	public static void main(String[] args) {
		double[]number;
		double sum=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter number of double values you want to enter");
		int arraySize=input.nextInt();
		number=new double[arraySize];
		
		for(int i=0;i<arraySize;i++) {
			System.out.println("Please enter the numbers");
			number[i]=input.nextDouble();
			
		}
		for(double num:number) {
			sum=sum+num;
		}
		System.out.println(" The sum of the numbers you entered is "+sum);
			
			
		}
		
		
		
		
	}


