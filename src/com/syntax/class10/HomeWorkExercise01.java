package com.syntax.class10;

public class HomeWorkExercise01 {

	public static void main(String[] args) {
		String[]animals= {"cat","dog","bear","tiger","panda","elephant"};
	
		for(int i = 0;i<animals.length;i++) {
			
			System.out.print(animals[i]+" ");
		}
		System.out.println();
		System.out.println("-----------------------------------------------------");
	
	    for(String animalName:animals) {
	    	System.out.print(animalName+" ");
	    }
		
		

	}

}
