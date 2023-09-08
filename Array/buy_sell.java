package com.itbulls.pratik;

public class buy_sell {


    public static void max_profit(int prices[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0;i<prices.length; i++) {
            if(buy_price < prices[i]){
                int profit = prices[i]-buy_price;
                max_profit = Math.max(max_profit, profit);

            }else{
                buy_price = prices[i];
            }
           
                
        

            }
        System.out.println(max_profit);

        }
        





    


    public static void main(String[] args) {

        int prices[] = {7,1,5,3,4,6}; 
        max_profit(prices);
	
	      
  }
}   
