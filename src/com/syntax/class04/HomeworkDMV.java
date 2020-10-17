package com.syntax.class04;

import java.util.Scanner;

public class HomeworkDMV {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println ("How old are you?");
		int age=input.nextInt();
		
		if (age>=18) {
			System.out.println ("You will get a driver license");

	}else {
		System.out.println ("You will get a learners permit");
	}
	}
}
