

        // TODO: Read two n×n matrices A and B, multiply them → print result C = A×B
        //       Input: matrix A row by row, then matrix B row by row
        //       Output: result matrix row by row, values separated by spaces
        //
        // Input:
        // 2
        // 1 2
        // 3 4
        // 5 6
        // 7 8
        //
        // Output:
        // 19 22
        // 43 50
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
