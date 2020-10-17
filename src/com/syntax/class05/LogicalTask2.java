package com.syntax.class05;

import java.util.Scanner;

public class LogicalTask2 {

	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 
	 System.out.println ("Please print what day is today, from 1-7");
	 int day=input.nextInt();
	 
	 if(day==1 || day<=5) {
		 System.out.println ("WEEKDAY");
	 }else if(day==6 || day==7) {
		 System.out.println ("WEEKEND");
	 }else {
		 System.out.println ("Invalid day");
	 }
	 

	}

}
