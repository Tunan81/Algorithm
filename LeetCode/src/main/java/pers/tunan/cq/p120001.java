package pers.tunan.cq;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/15
 */
public class p120001 {
    static class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            long result = powerSumModulo(n);
            System.out.println(result);

            scanner.close();
        }

        public static long powerSumModulo(int n) {
            long result = 0;
            int base = 6;
            int modulo = 7;

            for (int i = 1; i <= n; i++) {
                result = (result + (long) Math.pow(base, i)) % modulo;
            }

            return result;
        }
    }
}
