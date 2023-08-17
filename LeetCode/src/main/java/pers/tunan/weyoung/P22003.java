package pers.tunan.weyoung;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/16
 */
public class P22003 {
    static class Main{
        public static void main(String[] args) {
            // 计算时间
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(System.in);
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long m = scanner.nextLong();
            long n = scanner.nextLong();
            long L = scanner.nextLong();

            long d = gcd(L, Math.abs(n - m));

            if ((y - x) % d != 0) {
                System.out.println("Impossible");
            } else {
                long t = ((y - x + L) % L) * modInverse((n - m + L) % L, L) % L;
                System.out.println(t);
            }
            System.out.println("耗时：" + (System.currentTimeMillis() - startTime) + "ms");
        }

        public static long gcd(long a, long b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        public static long modInverse(long a, long m) {
            long[] extendedGCD = extendedGCD(a, m);
            long g = extendedGCD[0];
            long x = extendedGCD[1];

            if (g != 1) {
                return -1; // modular inverse does not exist
            } else {
                return (x + m) % m;
            }
        }

        public static long[] extendedGCD(long a, long b) {
            if (b == 0) {
                return new long[]{a, 1, 0};
            } else {
                long[] values = extendedGCD(b, a % b);
                long d = values[0];
                long y = values[1];
                long x = values[2];
                return new long[]{d, x, y - (a / b) * x};
            }
        }
    }
}
