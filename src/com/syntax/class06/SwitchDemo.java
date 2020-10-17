package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[]args){
	    String message;
	  Scanner input=new Scanner(System.in);
	  System.out.println("Enter name of the instructor");
	  String name=input.nextLine();
	  
	  switch (name){
	    case "Asghar":
	      message="Will take care of Java assignment";
	      break;
	    case "Moazam":
	    message="Will take care of SDLC Assignment";
	    break;
	    case "Weqas":
	      message="Will take care of Selenium Assignment";
	      break;
	    case "Asel":
	      message="Will take care of every Assignment";
	      break;
	      
	      default:
	      message="Invalid instructor selected";
	      break;
	      
	  }
	  System.out.println(message);
	  }

	}