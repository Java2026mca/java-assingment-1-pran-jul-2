

        // TODO: Implement a stack using an array (no Java Stack class)
        //       Process n operations:
        //         PUSH x  → push integer x
        //         POP     → pop top, print it; if empty print "EMPTY"
        //         PEEK    → print top without removing; if empty print "EMPTY"
        //         SIZE    → print current number of elements
        //
        // Input:
        // 6
        // PUSH 10
        // PUSH 20
        // PEEK
        // POP
        // POP
        // POP
        //
        // Output:
        // 20
        // 20
        // 10
        // EMPTY

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
