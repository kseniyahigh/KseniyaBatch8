package com.syntax.class06;

import java.util.Scanner;

public class HomeWorkLanguage {

	public static void main(String[] args) {
	String language;
	Scanner input=new Scanner(System.in);
	System.out.println("What is your country of birth?");
	String country=input.next();
	
	switch (country) {
	case "Russia":
		language="Russian";
		break;
	case "France":
		language="French";
		break;
	case "Germany":
		language="German";
		break;
	case "Spain":
		language="Spanish";
		break;
	case "Italy":
		language="Italian";
		break;
	case "Sweden":
		language="Swedish";
		break;
	case "China":
		language="Chinese";
		break;
	case "USA":
		language="English";
		
	 default:
		 language="Please enter valid country";
		
	}
 System.out.println(language);
	}

}
