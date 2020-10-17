package com.syntax.class04;
//shortcut to import:COMMAND+SHIFT+O
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=80;
        String str="I am a string";
        
        Scanner scan=new Scanner(System.in);//enable input
        
      
        System.out.println ("Please eneter any text");//adding message to user
        
        String value=scan.nextLine();//waits for input
        System.out.println("I captured String value="+value);
        
        System.out.println("Please enter your name");
        String name=scan.nextLine();
       
        
        
	}

}
