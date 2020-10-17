package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		
     String name="Olga";
     System.out.println (" My name is " + name);
     
     String lastName ="Sorrels";
     System.out.println(name+" "+ lastName);
     
     String city="Miami";
     System.out.println (name+" lives in "+city);
     
     char grade='B';
     System.out.println (name+" is "+grade+" student ");
    		 
    	int age=21;
    	System.out.println(name+" is "+age+" years old ");
    	
    	int date=27;
    	String month="September";
    	System.out.println(date+" "+month);
    	
    	String state="DC";
    	String anotherState="   DC";//EVERYTHING MATTERS INSIDE STRING!!THESE TWO STRINGS ARE NOT THE Same 
    	System.out.println(state);
    	System.out.println(anotherState);
    	
	}

}
