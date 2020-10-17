package com.syntax.class04;

import java.util.Scanner;

public class HomeworkCityAndTemperature {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("City name");
		String city=input.nextLine();
		System.out.println ("Temperature");
		int fahrenheit=input.nextInt();
		
		int celsius=(fahrenheit-32)*5/9;
		System.out.println (" The temperature in "+city+" is "+celsius);
		
		
		
		
		
	}
}

