package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {
	
public static void main (String[]args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.println ("Please enter boolean value for rain");
	
	boolean rain=input.nextBoolean();//waits for my input+enter
	
	if (rain) {
		System.out.println ("Please ttake an umbrella");
	}else {
		System.out.println ("Go for a walk");
	}
	System.out.println("----------Capture integer------------");
	
	
	System.out.println("Please eneter your name");
	String name=input.next();
	
	System.out.println("Please enter age");
	int age=input.nextInt();
	
	System.out.println(" Your age is "+age+" years old ");
	
	

}
}
