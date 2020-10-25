package com.syntax.class11;

public class Creating2dArray {

	public static void main(String[] args) {
		//create 2d array of food:
		//american
		//italian
		//asian
		//afghani
		//indian
		
		String[][]food= {
				{"hot dog","cheeseburger","steak"},
				{"pizza","pasta","canoli"},
				{"sushi","ramen","fried rice","dumplings"},
				{"kebab","manto"},
				{"beriyani","masala","curry","chicken tikka"}
		};
		
		for(String[] dishes:food) {//enhanced loop
			for(String dish:dishes) {
				System.out.print(dish+" ");
			}
			System.out.println();
		}
System.out.println("-----------------------------------------------------");

       for(int i=0;i<food.length;i++) {
    	   for(int j=0;j<food[i].length;j++) {
    		   System.out.println(food[i][j]+" ");
    	   }
       }


	}

}
