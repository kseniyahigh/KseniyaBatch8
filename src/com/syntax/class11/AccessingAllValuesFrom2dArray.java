package com.syntax.class11;

public class AccessingAllValuesFrom2dArray {

	public static void main(String[] args) {
char[][]$array=new char[3][4];
		
		//add values for first row
		$array[0][0]='a';
		$array[0][1]='b';
		$array[0][2]='c';
		$array[0][3]='d';
		
		//2nd row
		$array[1][0]='w';
		$array[1][1]='x';
		$array[1][2]='y';
		$array[1][3]='z';
		
		
		//3 row
		$array[2][0]='q';
		$array[2][1]='w';
		$array[2][2]='b';
		$array[2][3]='r';
		
		System.out.println($array.length);
		
		for(int row=0;row<$array.length;row++){//loops through rows
		
		for(int col=0;col<$array[row].length;col++) {
			System.out.println($array[row][col]);
		}
				
		}			

	}

}
