package com.itbulls.pratik.array_2d;
import java.util.Scanner;

public class print_matrix {
    public static boolean search(int matrix[][],int key){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                if (matrix[i][j] ==key){
                    System.out.println("found at index(" + i +"," +j+")");
                    return true;
                }
                }
            }
        System.out.println("Key not found");
        return false;
    }

    public static int largest(int matrix[][]){
        int row=0;
        int col=0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                if (matrix[i][j]>largest) {
                    largest = matrix[i][j];
                    row = i;
                    col = j;
                    
                }
                }
            }
            System.out.println("Largest value found at index("+ row +","+col+")");
            return largest;

    }

    public static void print(int matrix[][]){

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements for the 3x3 matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Close the Scanner to release resources
        sc.close();
        print(matrix);
        search(matrix,5);
        largest(matrix);


    
    }
}
