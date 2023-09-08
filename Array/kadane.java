package com.itbulls.pratik;

import java.util.Arrays;

public class kadane {
  
    public static void max_sum(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i = 0; i < numbers.length; i++) {
            curr_sum += numbers[i];
            max_sum=Math.max(curr_sum,max_sum);
            if(curr_sum<0) {
                curr_sum =0 ;}
            
        }
        if(max_sum==0){
            // sort the array
        Arrays.sort(numbers);
        max_sum = numbers[0];

        }
        else{
            System.out.println(max_sum);
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = {-1, -2, -6, -1, 3}; 
        max_sum(numbers);
    }
}

