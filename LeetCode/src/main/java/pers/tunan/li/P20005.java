package pers.tunan.li;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/10/11
 */
public class P20005 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int a = n / 2;
            int b = n - a;
            while (isPrime(a) || isPrime(b)) {
                a--;
                b++;
            }
            System.out.println(a + " " + b);
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
