package com.syntax.class04;

public class Example3 {
	public static void main (String[]args) {
		//check if assignment is completed
		//if completed---->if score>90-great job 
		//if score>80- good job
		//if score >70--please study more 
		
		int score=67;
		boolean assignment=true;
		
		
		if(assignment) {
			
			if (score>90) {
				System.out.println("You did great");
			}else if (score>80) {
				System.out.println ("You did good");
				
			}else if (score>70) {
				System.out.println ("You did ok");
				
			}else {
				System.out.println ("Good try");
			}
			
		
			
			
		}else {
			System.out.println ("You should do it");
		}
	}

}
