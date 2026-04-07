

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
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int numCommands = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < numCommands; i++) {
            if (!sc.hasNext()) break;
            String command = sc.next().toUpperCase();

            switch (command) {
                case "PUSH":
                    int val = sc.nextInt();
                    stack.push(val);
                    break;

                case "POP":
                    if (stack.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;

                case "PEEK":
                    if (stack.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;

                case "SIZE":
                    System.out.println(stack.size());
                    break;
            }
        }
    }
}
