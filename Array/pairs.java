package com.itbulls.pratik;

import java.util.Scanner;

public class pairs {
    public static void print_pairs(int numbers[]){
        for (int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("("+curr+","+numbers[j]+")");
        }
        System.out.println();

    }
}



      public static void main(String[] args) {

        int numbers[] = {2,4,6,8,10,12}; 
        print_pairs(numbers);
	
	      
  }
    
}
