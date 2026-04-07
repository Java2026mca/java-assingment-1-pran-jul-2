
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        int val = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (val <= n * n) {
            // 1. Move Left to Right
            for (int i = left; i <= right; i++) matrix[top][i] = val++;
            top++;

            // 2. Move Top to Bottom
            for (int i = top; i <= bottom; i++) matrix[i][right] = val++;
            right--;

            // 3. Move Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) matrix[bottom][i] = val++;
                bottom--;
            }

            // 4. Move Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = val++;
                left++;
            }
        }

        // Print Matrix and Calculate Diagonal Sum
        long diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + (j == n - 1 ? " " : " "));
                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal: " + diagonalSum);
    }
}
