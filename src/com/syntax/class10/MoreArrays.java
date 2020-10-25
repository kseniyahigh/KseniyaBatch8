package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
	char[] grade= {'A','B','C','D','E','F'};
	
	char sendValue=grade[1];
	//values from grades
	for(int i=0;i<grade.length;i++) {
		char valueFromArray=grade[i];
		System.out.println(valueFromArray);
	}

	}

}
