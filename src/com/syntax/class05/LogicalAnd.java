package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
	    String word1,word2,output=null;
	    int num1,num2;
	    Scanner input=new Scanner(System.in);
	    System.out.println("Please enter two strings");
	    word1=input.nextLine();
	    word2=input.nextLine();
	    System.out.println("Please enter two numbers");
	    num1=input.nextInt();
	    num2=input.nextInt();
	    
	  if(word1.equals(word2) && num1==num2){
	    output="AND";
	  }else if(num1==num2 || (word1.equals(word2))){
	    output="OR";
	  }else if(num1!=num2 && !(word1.equals(word2))){
	    output="NONE";
	  
	  }
	 System.out.println (output);
	  }

	}
		