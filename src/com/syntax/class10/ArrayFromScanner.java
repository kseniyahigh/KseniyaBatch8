package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// let's ask user how many names he would like to store and then store those names)
      Scanner input=new Scanner(System.in);
      String[]names;
      int size;
     
      
      System.out.println("How many names woulfd you like to store?");
      size=input.nextInt();
      
     names=new String[size];
     //storing values into an array
	for(int i=0;i<size;i++) {
    	  System.out.println("Please enter any name");
    	  names[i]=input.nextLine();
    	  
      }//we are retrieving values from an array
	for(int i=0;i<names.length;i++) {
		System.out.print(names[i]+" ");
	}
    
      
	}

}
