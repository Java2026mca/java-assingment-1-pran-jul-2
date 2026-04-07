
        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            int spaces = Math.abs(n - 1 - i);
            int middle = size - 2 * spaces;

            // left spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 0; j < middle; j++) {
                if (j == 0 || j == middle - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
