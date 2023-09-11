package com.itbulls.pratik.array_2d;

public class staircase_search {
    public static boolean search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while( row<matrix.length && col > 0){
            if( matrix[row][col]==key ){
                System.out.println("Key found at (" + row + "," + col+ ")");
                return true;

            }
            if( matrix[row][col]>key ){
                col--;
                }
            if( matrix[row][col]<key ){
                row++;
                }


        }
        System.out.println("Key not found at");
        return false;

    }







    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, 
                          {5, 6, 7, 8}, 
                          {9, 10, 11, 12}, 
                          {13, 14, 15, 16}};
        search(matrix,7);
    }
}
