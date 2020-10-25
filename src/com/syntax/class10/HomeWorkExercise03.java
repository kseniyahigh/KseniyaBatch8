package com.syntax.class10;

public class HomeWorkExercise03 {

	public static void main(String[] args) {
			
		String[]countries= {"Russia","Spain","Italy","Germany"};
		countries[0]="Moscow";
		countries[1]="Madrid";
		countries[2]="Rome";
		countries[3]="Germany";
		
		
		
		for(int i=0;i<countries.length;i++) {
		System.out.print(countries[i]+"  ");
		
	}
		System.out.println("----------------------------------------------------");

     for(String name:countries) {
	
	System.out.print(name+" ");
	
}
	
}
}