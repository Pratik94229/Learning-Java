package com.itbulls.pratik;

public class max_sum_subarray {
  
    public static void max_sum(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i <=numbers.length; i++){
            for(int j=i; j <=numbers.length; j++){
                int curr_sum = 0;
                for(int k=i; k <j; k++){
                    curr_sum += numbers[k];
                    
                }
                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                }

                
            }
        
        }
        System.out.println(max_sum);
             
    }


public static void main(String[] args) {

        int numbers[] = {1,-2,6,-1,3}; 
        max_sum(numbers);
	
	      
  }
    
}

    

