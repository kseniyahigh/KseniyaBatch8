package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		int a;
		
		for(a=1; a<6; a++) {
			System.out.println(" Value for an inside loop "+a);
		}
		System.out.println(" Value for an inside loop "+a);
		System.out.println("-----------what will be the output--------");
		
		int result=1;
		for (int i=10;i>=1;i-=2) {
			result*=i;
		
		System.out.println("Result="+result);
	}
	}
}
