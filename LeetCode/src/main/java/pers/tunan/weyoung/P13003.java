package pers.tunan.weyoung;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/8/14
 */
public class P13003 {

    static class main {
        public static int calculateNthNumber(int n) {
            if (n == 1) {
                return 1;
            } else if (n == 2) {
                return n;
            }

            int[] sequence = new int[n];
            sequence[0] = 1;
            sequence[1] = n;

            for (int i = 2; i < n; i++) {
                sequence[i] = sequence[i - 1] - sequence[i - 2];
            }

            return sequence[n - 1];
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int result = calculateNthNumber(n);
            System.out.println(result);
        }
    }
}
