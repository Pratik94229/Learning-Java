package com.itbulls.pratik.array_2d;

public class transpose {

        public static void mat_transpose(int matrix[][]) {
            int rows = matrix.length;
            int cols = matrix[0].length;
        
            // Ensure the matrix is square (rows == cols) for a valid transpose
            if (rows != cols) {
                System.out.println("Matrix is not square. Transpose not possible.");
                return;
            }
        
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < cols; j++) {
                    // Swap matrix[i][j] and matrix[j][i] without a temporary variable
                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
            }
        
            // Print the transposed matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // Move to the next row
            }
        }
        


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, 
                          {5, 6, 7, 8}, 
                          {9, 10, 11, 12}, 
                          {13, 14, 15, 16}};
        mat_transpose(matrix);
    }
    
}
