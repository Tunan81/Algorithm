package pers.tunan.cqie;

import java.util.Scanner;

/**
 * @author Tunan
 * @version 1.0
 * @date 2023/9/21
 */
public class P11007 {
    static class Main {
        public static void main(String[] args) {
            double count = 0;
            Scanner scanner = new Scanner(System.in);
            int L = scanner.nextInt();
            int T = scanner.nextInt();
            if (L <= 2) {
                count = 6 + (T / 3);
            } else if (L <= 10) {
                count = 6 + (L - 2) * 1.8 + (T / 3);
            } else {
                count = 6 + 14.4 + (L - 10) * 2.7 + (T / 3);
            }
            if (count % 1 == 0) {
                System.out.println((int) count);
            } else {
                System.out.printf("%.1f%n", count);
            }
        }
    }
}
