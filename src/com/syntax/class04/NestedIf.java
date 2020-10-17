package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// variable for allergy-yes or no
		// if allergy is yes--> we will check if pet allergy
		                        //if peanut allergy;
		//if pollen allergy 
		
		boolean allergy=true;
		
		boolean pet=false;
	
	
		if (allergy) {//only if outer if is true 
			
			System.out.println ("Let's do further check");
			
			if(pet) {//nested if/inner if
				System.out.println ("Please no pets");
				
			}else {
				System.out.println("That is good you do not have pet allergy");
			}
			
		
		}else {
			System.out.println ("You are lucky");
		}
        System.out.println ("----------EXMPLE2-----------------------");
        //IF TODAY IS Friday we will watch movie but would like to check the date
        //if date is 13----->watching scary movie;
        //if not----->i will watch cimedy 
        //if no Friday-----> i am studying
        
       boolean isFriday=false;
       int date=13;
       boolean monday=false;
       if (isFriday) {
    	   if (date==13) {
    		   System.out.println ("I will watch scary movie");
    	   }else {
    		   System.out.println ("I will watch comedy");
    	   }
    	   
       }else {
    	   if(monday) {
    		   System.out.println ("I am working");
    		  
    	   }else {
    		   System.out.println ("I have class at Syntax");
    	   }
    	   
       }
	}

}
