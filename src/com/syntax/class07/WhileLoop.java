package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO print numbers from 100 to 1(odd nums only
		int num=100;
		
		while(num>0) {
			
		if ((num%2)!=0) {
			System.out.print(num+" ");
		}
			num--;
		
		}
	}

}
