package com.syntax.class11;

public class GroupClass07 {

	public static void main(String[] args) {
		int[][] array = { 
				{ 1, 2, 11, 14 }, 
				{ 18, 12, 3, 25 }, 
				{ 5, 8, 7, 19 } 
				};
		for (int i = 0; i < array.length; i++) {
			for (int a = 0; a < array[i].length; a++) {
				if (array[i][a] % 2 == 0) {
					System.out.println(array[i][a]);
				}
			}
		}
	}

	

}
