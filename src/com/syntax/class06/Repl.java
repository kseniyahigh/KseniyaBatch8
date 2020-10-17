package com.syntax.class06;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		 String message;
		  Scanner input=new Scanner(System.in);
		  System.out.println("Input a number between 1-7");
		  int num=input.nextInt();
		  
		  switch(num){
		    case 1:
		      message="Monday";
		      break;
		    case 2:
		      message="Tuesday";
		      break;
		    case 3:
		        message="Wednesday";
		        break;
		    case 4:
		      message="Thursday";
		      break;
		    case 5:
		      message="Friday";
		      break;
		    case 6:
		      message="Saturday";
		      break;
		    case 7:
		     message="Sunday";
		     break;
		     
		     default:
		     message="Invalid";
		     break;
		      
		      
		  }
		  System.out.println(message);
		  
		  
			

	}

}
