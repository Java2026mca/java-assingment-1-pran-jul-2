
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        // Read Matrix A
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sc.hasNextInt()) a[i][j] = sc.nextInt();
            }
        }

        // Read Matrix B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sc.hasNextInt()) b[i][j] = sc.nextInt();
            }
        }

        // Multiply A and B
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print Result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + (j == n - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}
