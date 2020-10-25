package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
	int a=10;
	
	a=20;
	
	int[]num=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	
	//to access elements from an array?
	System.out.println(num[3]);
	
	System.out.println(num[1]+num[4]);
	
	//i wold like ti change 50 to 100;
	num[4]=100;
	System.out.println(" Value of 5th element after change "+num[4]);
	
	double[]array=new int[2];
	String[]array=new String[4];
	array[0]="Hello";
	
	

	}

}
