package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// we need to compare 2 numbers
		//bigger, smaller, equal

		int num1=19;
		int num2=99;
		
		if(num1>num2) {//what if this condition is true
			System.out.println (num1+"is bigger than "+num2);
	
		}else if (num1<num2) {//or what if this is true
			System.out.println(num1+" is smaller than "+num2);
			
		}else {
			System.out.println (num1+" is equal  to "+num2);
		}
		//Based on the day of the week we will print class schedule
		
		int day=7;
		
		if(day==1) {
        System.out.println("Today is Monday we have no class");
		}else if(day==2) {
			System.out.println ("Today is Tuesday and we have manual class");
		}else if(day==3) {
			System.out.println ("Today is Wednesday and we have manual class");
		}else if (day==4) {
			System.out.println ("Today is Thursday and we have review class");	
		}else if (day==5) {
			System.out.println ("Today is Friday but i will have class tomorrow");
			
		}else if(day==6) {
			System.out.println ("Today is Saturday, I did a lot of coding");
			
		}else {
			System.out.println ("This is invalid day of a week");
			
		}
}
}