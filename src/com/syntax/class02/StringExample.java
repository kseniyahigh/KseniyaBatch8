package com.syntax.class02;

public class StringExample {

	public static void main(String[] args) {
		//String is non-primitive datatype
		String variable = "Hello";

		String mySentence = "Today is Sunday,September 27";
		
		System.out.println (mySentence);
		
		//int number="99"; anything we put inside""--->becomes a String
		
		String number="99";//we will get 99 as a String
		
		System.out.println(number);
		
		//char c="C"; Error because anything we put inside ""----> becomes String
		String oneLetter="Y";
		System.out.println (oneLetter);

	}

}
