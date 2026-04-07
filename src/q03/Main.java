import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (!sc.hasNextLong()) break;
            long num = sc.nextLong();
            System.out.println(checkNumber(num));
        }
    }

    private static String checkNumber(long n) {
        if (n <= 1) return "Neither";

        if (isPerfect(n)) return "Perfect";
        if (isPrime(n)) return "Prime";
        
        return "Neither";
    }

    private static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    private static boolean isPerfect(long n) {
        if (n < 6) return false;
        long sum = 1;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }
}
