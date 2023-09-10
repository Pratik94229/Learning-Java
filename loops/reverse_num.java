package com.itbulls.pratik;
import java.util.*;

public class reverse_num {

    
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int number = sc.nextInt();
	  rev=0
	  while(number>0) {
		  int last = number%10;
		  rev =rev*10+last;
	      number=number/10;
	  }
      System.out.print(rev+"") ;
	      
  }
  
}
	  
