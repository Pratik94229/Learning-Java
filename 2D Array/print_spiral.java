package com.itbulls.pratik.array_2d;

public class print_spiral {

    public static void print(int matrix[][]) {
        int start_row = 0;
        int start_col = 0;
        int end_row = matrix.length - 1;
        int end_col = matrix[0].length - 1;

        while (start_row <= end_row && start_col <= end_col) {
            // Print top
            for (int j = start_col; j <= end_col; j++) {
                System.out.print(matrix[start_row][j] + " ");
            }
            System.out.println();

            // Print right
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.print(matrix[i][end_col] + " ");
            }
            System.out.println();

            // Print bottom
            if (start_row != end_row) { // Check if it's not a single row
                for (int j = end_col - 1; j >= start_col; j--) {
                    System.out.print(matrix[end_row][j] + " ");
                }
                System.out.println();
            }

            // Print left
            if (start_col != end_col) { // Check if it's not a single column
                for (int i = end_row - 1; i >= start_row + 1; i--) {
                    System.out.print(matrix[i][start_col] + " ");
                }
                System.out.println();
            }

            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 78}, 
                          {5, 6, 7, 8, 72}, 
                          {9, 10, 11, 12, 34}, 
                          {13, 14, 15, 16, 90}};
        print(matrix);
    }
}
