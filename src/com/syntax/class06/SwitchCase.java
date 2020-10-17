package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase {//
public static void main (String[]args) {
	Scanner input=new Scanner(System.in);
	String today;
    int day=input.nextInt();
	switch(day) {//datatype of variable must match with datatype of cases
	case 1:
		today="Monday";
		break;
	case 2:
		today="Tuesday";
		break;
	case 3:
		today="Wednesday";
		break;
	case 4:
		today="Thursday";
		break;
	case 5:
		today="Friday";
		break;
	case 6:
		today="Saturday";
		break;
	case 7:
		today="Sunday";
		break;
		
		default:
		today="Invalid Day";
		break;
		
	}
	System.out.println(" Today is "+today);	
}
}
