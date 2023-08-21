package pers.tunan.cq.order;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/20
 */
public class P12007 {
    // todo 1
    static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long n = scanner.nextInt();
            long k = scanner.nextInt();
            long sum = 0;
            // 有两种情况
            if (n > k) {
                sum = k * (k + 1) / 2;
            } else {
                long y = k % n;
                long s = k / n;
                long number1 = 0;
                long number2 = 0;
                for (long i = 0; i < n; i++) {
                    number1 += i;
                }
                for (long i = 0; i <= y; i++) {
                    number2 += i;
                }
                sum = number1 * s + number2;
            }
            System.out.print(sum);
        }
    }
}
