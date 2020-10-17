package com.syntax.class05;

import java.util.Scanner; 
class Main {
  public static void main (String[]args) {
    Scanner input=new Scanner(System.in);
    boolean loan;
    String eligibility=null;
    double score;
    System.out.println ("Do you need a loan?");
    loan=input.nextBoolean();
    
    if(loan){
      System.out.println("What is your credit score?");
      score=input.nextDouble();
     if(score<600){
    eligibility = "Not eligible";
    }else if(score>600 && score<=700){
    eligibility = "Maybe eligible";
    }else if(score>701 && score<=800){
    eligibility = "Eligible";
    }else{
      eligibility ="Deffinitely eligible";
    } 
  }else{
    eligibility ="Unknown";
  }
  
  System.out.println(" The eligibility is "+eligibility);
}
}