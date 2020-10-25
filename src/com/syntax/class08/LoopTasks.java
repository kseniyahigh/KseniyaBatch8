package com.syntax.class08;

import java.util.Scanner;

public class LoopTasks {

	public static void main(String[] args) {
		int start, end;
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter numbers from 1 to 50 except those that are divisible by 3");
		for (int i=1;i<=50;i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.println (i+"");
		}
		
		
		

	}

}
