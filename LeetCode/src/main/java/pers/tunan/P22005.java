package pers.tunan;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/18
 */
public class P22005 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int count = 0;

        }
        public static boolean isPrime(int n) {
            if (n == 2) {
                return false;
            }
            if (n % 2 == 0) {
                return true;
            }
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return true;
                }
            }
            return false;
        }
    }
}
