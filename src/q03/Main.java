
        // TODO: Fill an N×N matrix in clockwise spiral order starting from 1
        //       Print each row with values separated by single space
        //       Then print: "Diagonal: X" where X = sum of primary diagonal (top-left to bottom-right)
        //
        // Input: 3
        // Output:
        // 1 2 3
        // 8 9 4
        // 7 6 5
        // Diagonal: 15
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.isEmpty()) return;

        int n = Integer.parseInt(line.trim());
        int[][] matrix = new int[n][n];
        
        int value = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (value <= n * n) {
            // Left to Right
            for (int i = left; i <= right; i++) matrix[top][i] = value++;
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
                left++;
            }
        }

        // Print Matrix and Calculate Diagonal Sum
        long diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder rowStr = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowStr.append(matrix[i][j]);
                if (j < n - 1) rowStr.append(" ");
                if (i == j) diagonalSum += matrix[i][j];
            }
            System.out.println(rowStr.toString());
        }
        
        System.out.println("Diagonal: " + diagonalSum);
    }
}
