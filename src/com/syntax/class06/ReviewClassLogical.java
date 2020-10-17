package com.syntax.class06;

public class ReviewClassLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int number=0;
     
     if (number>=0) {
    	 if(number<=100) {
    		 System.out.print("Number is between 0 and 100");
    	 }else {
    		 System.out.print("Number is not between 0 and 100");
    	 }
     }else {
    	 System.out.print("Number is not beween 0 and 100");
     }
     if(number>=0 && number<=100) {
    	 System.out.println ("Number is between 0 and 100");
    	 
     }
	}

}
