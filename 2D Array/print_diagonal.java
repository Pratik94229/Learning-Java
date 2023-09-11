package com.itbulls.pratik.array_2d;

public class print_diagonal {

/*    //O n2
    public static void print(int matrix[][]){
        int sum = 0;
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0;j<matrix.length;j++) {
                if(i==j) {
                    sum+=matrix[i][j];
                }
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);

    }
*/ 

public static void print(int matrix[][]){
        int sum = 0;
        for (int i = 0; i<matrix.length; i++) {
            //pd
            sum+=matrix[i][i];

            //sd
            if(i != matrix.length-1-i){
            sum+=matrix[i][matrix.length-1-i];
        }
        

    }
    System.out.println(sum);
}



    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 78}, 
                          {5, 6, 7, 8, 72}, 
                          {9, 10, 11, 12, 34}, 
                          {13, 14, 15, 16, 90}};
        print(matrix);
    }
    
}
