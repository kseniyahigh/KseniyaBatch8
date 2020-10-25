package com.syntax.class10;

public class Arrays {

	public static void main(String[] args) {
		int[] grades=new int[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		int average=(grades[0]+grades[1]+grades[3]+grades[5])/5;
		
		System.out.println("Average score of my students="+average);
		
		int a=10;
		int b;
		b=10;
		
		double[]array;
		
		array=new double [3];
		array[0]=12.99;
		array[1]=10.89;
		
		System.out.println("Value of last element "+array[2]);
		
		array[2]=5.99;
		System.out.println("Value of last element "+array[2]);
		
		String[]liquid=new String[4];//arrays are fixed in size
		

	}

}
