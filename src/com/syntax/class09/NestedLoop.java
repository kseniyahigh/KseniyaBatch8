package com.syntax.class09;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i=0;i<3;i++) {//outer loop
			System.out.println("Hello");
			
		for (int y=0;y<3;y++) {//inner loop
			System.out.println("Bye");
		}
		}
		System.out.println("-------------More Examples------------");
		
		for (int i=10;i<=14;i++) {//controls how many times
			System.out.println(i);
		for (int j=1;j<=4;j++) {
			System.out.println("i="+i+" ja="+j);
		}
		System.out.println();
		}
System.out.println("-------how can i print nums from 10 to 99 using nested loop-----------");

     for (int i=1;i<=9;i++) {
    
    	 
     for (int j=0;j<=9;j++) {
     System.out.println(i+""+j);
	}
	}
     System.out.println("-----------how can i print clock----------");
     
     for(int h=0;h<23;h++) {
    	 
    		 
    	for(int m=0;m<60;m++) {
    	if(m<10) {	
    		System.out.println(h+":0"+m);
    	}else {
         	
    	System.out.println(h+":"+m);
    	}
     }
     
     }
     System.out.println("-------------how to print car odometer ------------------");
     String miles="";
     
     for(int i=0;i<10;i++) {
       for(int j=0;j<10;j++) {
    	   for(int j2=0;j2<10;j2++) {
    		  for (int k = 0;k<10;k++) {
    			  for(int k2 = 0;k2<10;k2++) {
    				  miles=""+i+""+j+""+j2+""+k+""+k2;
    				  System.out.println(miles);
    				  
    			  }
    		  }
    	   }
       }
     }
     
     
     
     

}
}