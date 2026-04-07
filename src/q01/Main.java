
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
        String input = br.readLine();
        
        // Handle empty input to prevent errors
        if (input == null || input.isEmpty()) return;
        
        int n = Integer.parseInt(input.trim());
        
        // A diamond with n=1 is just a single star
        if (n == 1) {
            System.out.println("*");
            return;
        }

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            int spaces = Math.abs(n - 1 - i);
            int middle = size - 2 * spaces;

            // 1. Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // 2. Print the hollow star pattern
            for (int j = 0; j < middle; j++) {
                // Print star at the first and last position of the middle section
                if (j == 0 || j == middle - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // 3. Move to next line
            System.out.println();
        }
    }
}
