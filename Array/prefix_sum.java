package com.itbulls.pratik;

public class prefix_sum {
  
    public static void max_sum(int numbers[]){
        int curr_sum = 0;
        int prefix_array[] = new int[numbers.length];
        prefix_array[0] = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            prefix_array[i] = prefix_array[i-1] + numbers[i];
        }
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) { // Change the condition to i < numbers.length
            int start = i;
            for(int j = i; j < numbers.length; j++) { // Change the condition to j < numbers.length
                int end = j;
                curr_sum = start == 0 ? prefix_array[end] : prefix_array[end] - prefix_array[start-1];

                if(curr_sum > max_sum){
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println(max_sum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3}; 
        max_sum(numbers);
    }
}
