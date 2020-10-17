package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		 String word1,word2;
		    String output = null;
		    int num1,num2;
		    Scanner input=new Scanner(System.in);
		    System.out.println("Please enter two strings");
		    word1=input.next();
		    word2=input.next();
		    System.out.println("Please enter two numbers");
		    num1=input.nextInt();
		    num2=input.nextInt();
		    
		    if(num1==num2 && word1==word2){
		    output="AND";
		  }else if(num1==num2 || word1==word2){
		    output="OR";
		  }else if(num1!=num2 && word1!=word2){
		    output="NONE";
		  
		  }
		   System.out.println(" Output: "+output);
		  }

		}