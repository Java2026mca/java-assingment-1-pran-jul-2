import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        int val = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        // Fill the matrix in a clockwise spiral
        while (val <= n * n) {
            // Move Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = val++;
            }
            top++;

            // Move Down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = val++;
            }
            right--;

            // Move Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = val++;
                }
                bottom--;
            }

            // Move Up
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = val++;
                }
                left++;
            }
        }

        long diagonalSum = 0;
        // Print the matrix and calculate the Main Diagonal (i == j)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) System.out.print(" ");
                
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Diagonal: " + diagonalSum);
        sc.close();
    }
}
